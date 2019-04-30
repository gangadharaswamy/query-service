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


import com.wavefront.rest.models.ResponseContainerPagedSavedSearch;
import com.wavefront.rest.models.ResponseContainerSavedSearch;
import com.wavefront.rest.models.SavedSearch;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SavedSearchApi {
  private ApiClient apiClient;

  public SavedSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SavedSearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for createSavedSearch
   *
   * @param body                    Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call createSavedSearchCall(SavedSearch body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call createSavedSearchValidateBeforeCall(SavedSearch body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


    com.squareup.okhttp.Call call = createSavedSearchCall(body, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Create a saved search
   *
   * @param body Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @return ResponseContainerSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerSavedSearch createSavedSearch(SavedSearch body) throws ApiException {
    ApiResponse<ResponseContainerSavedSearch> resp = createSavedSearchWithHttpInfo(body);
    return resp.getData();
  }

  /**
   * Create a saved search
   *
   * @param body Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @return ApiResponse&lt;ResponseContainerSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerSavedSearch> createSavedSearchWithHttpInfo(SavedSearch body) throws ApiException {
    com.squareup.okhttp.Call call = createSavedSearchValidateBeforeCall(body, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Create a saved search (asynchronously)
   *
   * @param body     Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call createSavedSearchAsync(SavedSearch body, final ApiCallback<ResponseContainerSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = createSavedSearchValidateBeforeCall(body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for deleteSavedSearch
   *
   * @param id                      (required)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call deleteSavedSearchCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch/{id}"
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call deleteSavedSearchValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException("Missing the required parameter 'id' when calling deleteSavedSearch(Async)");
    }


    com.squareup.okhttp.Call call = deleteSavedSearchCall(id, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Delete a specific saved search
   *
   * @param id (required)
   * @return ResponseContainerSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerSavedSearch deleteSavedSearch(String id) throws ApiException {
    ApiResponse<ResponseContainerSavedSearch> resp = deleteSavedSearchWithHttpInfo(id);
    return resp.getData();
  }

  /**
   * Delete a specific saved search
   *
   * @param id (required)
   * @return ApiResponse&lt;ResponseContainerSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerSavedSearch> deleteSavedSearchWithHttpInfo(String id) throws ApiException {
    com.squareup.okhttp.Call call = deleteSavedSearchValidateBeforeCall(id, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete a specific saved search (asynchronously)
   *
   * @param id       (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call deleteSavedSearchAsync(String id, final ApiCallback<ResponseContainerSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = deleteSavedSearchValidateBeforeCall(id, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for getAllEntityTypeSavedSearches
   *
   * @param entitytype              (required)
   * @param offset                  (optional, default to 0)
   * @param limit                   (optional, default to 100)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call getAllEntityTypeSavedSearchesCall(String entitytype, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch/type/{entitytype}"
        .replaceAll("\\{" + "entitytype" + "\\}", apiClient.escapeString(entitytype.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    if (limit != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call getAllEntityTypeSavedSearchesValidateBeforeCall(String entitytype, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

    // verify the required parameter 'entitytype' is set
    if (entitytype == null) {
      throw new ApiException("Missing the required parameter 'entitytype' when calling getAllEntityTypeSavedSearches(Async)");
    }


    com.squareup.okhttp.Call call = getAllEntityTypeSavedSearchesCall(entitytype, offset, limit, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Get all saved searches for a specific entity type for a user
   *
   * @param entitytype (required)
   * @param offset     (optional, default to 0)
   * @param limit      (optional, default to 100)
   * @return ResponseContainerPagedSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerPagedSavedSearch getAllEntityTypeSavedSearches(String entitytype, Integer offset, Integer limit) throws ApiException {
    ApiResponse<ResponseContainerPagedSavedSearch> resp = getAllEntityTypeSavedSearchesWithHttpInfo(entitytype, offset, limit);
    return resp.getData();
  }

  /**
   * Get all saved searches for a specific entity type for a user
   *
   * @param entitytype (required)
   * @param offset     (optional, default to 0)
   * @param limit      (optional, default to 100)
   * @return ApiResponse&lt;ResponseContainerPagedSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerPagedSavedSearch> getAllEntityTypeSavedSearchesWithHttpInfo(String entitytype, Integer offset, Integer limit) throws ApiException {
    com.squareup.okhttp.Call call = getAllEntityTypeSavedSearchesValidateBeforeCall(entitytype, offset, limit, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerPagedSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get all saved searches for a specific entity type for a user (asynchronously)
   *
   * @param entitytype (required)
   * @param offset     (optional, default to 0)
   * @param limit      (optional, default to 100)
   * @param callback   The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call getAllEntityTypeSavedSearchesAsync(String entitytype, Integer offset, Integer limit, final ApiCallback<ResponseContainerPagedSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = getAllEntityTypeSavedSearchesValidateBeforeCall(entitytype, offset, limit, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerPagedSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for getAllSavedSearches
   *
   * @param offset                  (optional, default to 0)
   * @param limit                   (optional, default to 100)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call getAllSavedSearchesCall(Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    if (limit != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call getAllSavedSearchesValidateBeforeCall(Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


    com.squareup.okhttp.Call call = getAllSavedSearchesCall(offset, limit, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Get all saved searches for a user
   *
   * @param offset (optional, default to 0)
   * @param limit  (optional, default to 100)
   * @return ResponseContainerPagedSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerPagedSavedSearch getAllSavedSearches(Integer offset, Integer limit) throws ApiException {
    ApiResponse<ResponseContainerPagedSavedSearch> resp = getAllSavedSearchesWithHttpInfo(offset, limit);
    return resp.getData();
  }

  /**
   * Get all saved searches for a user
   *
   * @param offset (optional, default to 0)
   * @param limit  (optional, default to 100)
   * @return ApiResponse&lt;ResponseContainerPagedSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerPagedSavedSearch> getAllSavedSearchesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    com.squareup.okhttp.Call call = getAllSavedSearchesValidateBeforeCall(offset, limit, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerPagedSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get all saved searches for a user (asynchronously)
   *
   * @param offset   (optional, default to 0)
   * @param limit    (optional, default to 100)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call getAllSavedSearchesAsync(Integer offset, Integer limit, final ApiCallback<ResponseContainerPagedSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = getAllSavedSearchesValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerPagedSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for getSavedSearch
   *
   * @param id                      (required)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call getSavedSearchCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch/{id}"
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call getSavedSearchValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException("Missing the required parameter 'id' when calling getSavedSearch(Async)");
    }


    com.squareup.okhttp.Call call = getSavedSearchCall(id, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Get a specific saved search
   *
   * @param id (required)
   * @return ResponseContainerSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerSavedSearch getSavedSearch(String id) throws ApiException {
    ApiResponse<ResponseContainerSavedSearch> resp = getSavedSearchWithHttpInfo(id);
    return resp.getData();
  }

  /**
   * Get a specific saved search
   *
   * @param id (required)
   * @return ApiResponse&lt;ResponseContainerSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerSavedSearch> getSavedSearchWithHttpInfo(String id) throws ApiException {
    com.squareup.okhttp.Call call = getSavedSearchValidateBeforeCall(id, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get a specific saved search (asynchronously)
   *
   * @param id       (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call getSavedSearchAsync(String id, final ApiCallback<ResponseContainerSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = getSavedSearchValidateBeforeCall(id, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for updateSavedSearch
   *
   * @param id                      (required)
   * @param body                    Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @param progressListener        Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call updateSavedSearchCall(String id, SavedSearch body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/api/v2/savedsearch/{id}"
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
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

    String[] localVarAuthNames = new String[]{"api_key"};
    return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call updateSavedSearchValidateBeforeCall(String id, SavedSearch body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException("Missing the required parameter 'id' when calling updateSavedSearch(Async)");
    }


    com.squareup.okhttp.Call call = updateSavedSearchCall(id, body, progressListener, progressRequestListener);
    return call;

  }

  /**
   * Update a specific saved search
   *
   * @param id   (required)
   * @param body Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @return ResponseContainerSavedSearch
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ResponseContainerSavedSearch updateSavedSearch(String id, SavedSearch body) throws ApiException {
    ApiResponse<ResponseContainerSavedSearch> resp = updateSavedSearchWithHttpInfo(id, body);
    return resp.getData();
  }

  /**
   * Update a specific saved search
   *
   * @param id   (required)
   * @param body Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @return ApiResponse&lt;ResponseContainerSavedSearch&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ResponseContainerSavedSearch> updateSavedSearchWithHttpInfo(String id, SavedSearch body) throws ApiException {
    com.squareup.okhttp.Call call = updateSavedSearchValidateBeforeCall(id, body, null, null);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Update a specific saved search (asynchronously)
   *
   * @param id       (required)
   * @param body     Example Body:  &lt;pre&gt;{   \&quot;query\&quot;: {     \&quot;foo\&quot;: \&quot;{\\\&quot;searchTerms\\\&quot;:[{\\\&quot;type\\\&quot;:\\\&quot;freetext\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;foo\\\&quot;}]}\&quot;   },   \&quot;entityType\&quot;: \&quot;DASHBOARD\&quot; }&lt;/pre&gt; (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call updateSavedSearchAsync(String id, SavedSearch body, final ApiCallback<ResponseContainerSavedSearch> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = updateSavedSearchValidateBeforeCall(id, body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ResponseContainerSavedSearch>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
