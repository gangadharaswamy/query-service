package com.wavefront.query.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.net.UnknownHostException;
import java.time.Instant;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;

import com.google.common.collect.ImmutableMap;

import com.wavefront.sdk.common.WavefrontSender;
import com.wavefront.sdk.direct.ingestion.WavefrontDirectIngestionClient;

/**
 * Wavefront Query Service App
 **/
@SpringBootApplication
public class Application {

  private final static Logger log = LoggerFactory.getLogger(Application.class);

  private final static int ARGS_LEN = 2;
  private static String cluster;
  private static String token;
  private final String wavefrontURL = "https://" + cluster + ".wavefront.com";
  Timer timer = new Timer();

  @Autowired
  private WavefrontSender wavefrontSender;

  public static void main(String[] args) {
    if (ARGS_LEN == args.length) {
      cluster = args[0].toString();
      token = args[1].toString();
      SpringApplication.run(Application.class, args);
    } else {
      log.warn("Please input two arguments: 'cluster' and 'api-token'!");
    }
  }

  @Bean
  WavefrontSender healthReporter() {

    WavefrontDirectIngestionClient.Builder wfDirectIngestionClientBuilder =
        new WavefrontDirectIngestionClient.Builder(wavefrontURL, token);

    wfDirectIngestionClientBuilder.maxQueueSize(100_000);

    wfDirectIngestionClientBuilder.batchSize(20_000);

    wfDirectIngestionClientBuilder.flushIntervalSeconds(2);

    wavefrontSender = wfDirectIngestionClientBuilder.build();


      TimerTask task = new TimerTask() {
        @Override
        public void run() {
            sendMetrics("adm.queryservice.health", 1);
        }
      };

      timer.schedule(task, 1000, 60000);

    return wavefrontSender;
  }

  Application sendMetrics(String metric, int value) {
    InetAddress ip = null;
    try {
      ip = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
      log.error(e.getMessage());
    }
    WavefrontDirectIngestionClient.Builder wfDirectIngestionClientBuilder =
        new WavefrontDirectIngestionClient.Builder(wavefrontURL, token);

    wfDirectIngestionClientBuilder.maxQueueSize(100_000);

    wfDirectIngestionClientBuilder.batchSize(20_000);

    wfDirectIngestionClientBuilder.flushIntervalSeconds(2);

    wavefrontSender = wfDirectIngestionClientBuilder.build();
    try {
      wavefrontSender.sendMetric(metric, value,
          Instant.now().toEpochMilli(), ip.getHostName().toString(),
          ImmutableMap.<String, String>builder().put("cluster", "eks-dev").build());
    } catch (IOException e) {
      log.error(e.getMessage());
    }
    return this;
  }
}