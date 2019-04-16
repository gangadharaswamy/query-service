package com.wavefront.query.service;

import java.time.Instant;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavefront.rest.api.ApiClient;
import com.wavefront.rest.api.ApiResponse;
import com.wavefront.rest.api.client.QueryApi;
import com.wavefront.rest.models.QueryResult;
import com.wavefront.rest.models.Timeseries;

@RestController
public class ApplicationHealthStatusController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from wavefront health";
	}

	@GetMapping(path = "/api/v1/query", produces = "application/json")
	ResponseEntity<String> health(@RequestHeader(name = "Authorization", required = true) String authHeader,
			@RequestParam(name = "c", required = true) String clusterName,
			@RequestParam(name = "q", required = true) String query) {
		try {
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath("https://" + clusterName + ".wavefront.com");
			apiClient.setApiKey(authHeader);
			QueryApi apiq = new QueryApi(apiClient);
			Instant instant = Instant.now();
			long timeStampMillis = instant.toEpochMilli() - 300000;
			ApiResponse<QueryResult> result = apiq.queryApiWithHttpInfo(query, Long.toString(timeStampMillis), "m",
					null, null, null, false, false, null, false, false, false, false, false);
			if (result.getStatusCode() == HttpStatus.OK.value()) {
				QueryResult qr = result.getData();
				List<Timeseries> ts = qr.getTimeseries();
				Timeseries t = ts.get(ts.size() - 1);
				List<List<Float>> f = t.getData();
				List<Float> l = f.get(f.size() - 1);
				int lastValue = l.get(1).intValue();
				if (lastValue == 1) {
					return new ResponseEntity<String>(HttpStatus.OK.toString(), null, HttpStatus.OK);
				} else if (lastValue == 0) {
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND.toString(), null, HttpStatus.NOT_FOUND);
				} else {
					return new ResponseEntity<String>(HttpStatus.BAD_REQUEST.toString() + " - Warning: Not a boolean result query: " + query, null, HttpStatus.BAD_REQUEST);
				}
			} else {
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception ex) {
			return new ResponseEntity<String>("Error: While executing the query: " + query + " " + ex.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}