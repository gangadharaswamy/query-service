/*
 * Wavefront REST API
 * <p>The Wavefront REST API enables you to interact with Wavefront servers using standard REST API tools. You can use the REST API to automate commonly executed operations such as automatically tagging sources.</p><p>When you make REST API calls outside the Wavefront REST API documentation you must add the header \"Authorization: Bearer &lt;&lt;API-TOKEN&gt;&gt;\" to your HTTP requests.</p>
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wavefront.rest.api.client;

import com.wavefront.rest.api.ApiCallback;
import com.wavefront.rest.api.ApiClient;
import com.wavefront.rest.api.ApiException;
import com.wavefront.rest.api.ApiResponse;
import com.wavefront.rest.api.Configuration;
import com.wavefront.rest.api.Pair;
import com.wavefront.rest.api.ProgressRequestBody;
import com.wavefront.rest.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectIngestionApi {
    private ApiClient apiClient;

    public DirectIngestionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DirectIngestionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for report
     * @param f Format of data to be ingested (optional, default to wavefront)
     * @param body Data to be ingested, in the specified format.  See https://docs.wavefront.com/direct_ingestion.html for more detail on how to format the data. Example in \&quot;wavefront\&quot; format:  &lt;pre&gt;test.metric 100 source&#x3D;test.source&lt;/pre&gt; which ingests a time series point with metric name \&quot;test.metric\&quot;, source name \&quot;test.source\&quot;, and value of 100 with timestamp of now. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reportCall(String f, String body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/report";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (f != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("f", f));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream", "application/x-www-form-urlencoded", "text/plain"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call reportValidateBeforeCall(String f, String body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = reportCall(f, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Directly ingest data/data stream with specified format
     * 
     * @param f Format of data to be ingested (optional, default to wavefront)
     * @param body Data to be ingested, in the specified format.  See https://docs.wavefront.com/direct_ingestion.html for more detail on how to format the data. Example in \&quot;wavefront\&quot; format:  &lt;pre&gt;test.metric 100 source&#x3D;test.source&lt;/pre&gt; which ingests a time series point with metric name \&quot;test.metric\&quot;, source name \&quot;test.source\&quot;, and value of 100 with timestamp of now. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void report(String f, String body) throws ApiException {
        reportWithHttpInfo(f, body);
    }

    /**
     * Directly ingest data/data stream with specified format
     * 
     * @param f Format of data to be ingested (optional, default to wavefront)
     * @param body Data to be ingested, in the specified format.  See https://docs.wavefront.com/direct_ingestion.html for more detail on how to format the data. Example in \&quot;wavefront\&quot; format:  &lt;pre&gt;test.metric 100 source&#x3D;test.source&lt;/pre&gt; which ingests a time series point with metric name \&quot;test.metric\&quot;, source name \&quot;test.source\&quot;, and value of 100 with timestamp of now. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> reportWithHttpInfo(String f, String body) throws ApiException {
        com.squareup.okhttp.Call call = reportValidateBeforeCall(f, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Directly ingest data/data stream with specified format (asynchronously)
     * 
     * @param f Format of data to be ingested (optional, default to wavefront)
     * @param body Data to be ingested, in the specified format.  See https://docs.wavefront.com/direct_ingestion.html for more detail on how to format the data. Example in \&quot;wavefront\&quot; format:  &lt;pre&gt;test.metric 100 source&#x3D;test.source&lt;/pre&gt; which ingests a time series point with metric name \&quot;test.metric\&quot;, source name \&quot;test.source\&quot;, and value of 100 with timestamp of now. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reportAsync(String f, String body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = reportValidateBeforeCall(f, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
