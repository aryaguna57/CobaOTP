package com.cobacoba.cobaotp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CitCallAPI {

    @POST("call")
    @Headers({"Content-Type: application/json","Authorization: ZGlnaXJvaW46YTJhY2FjZTEyMmY0YzQ0YzI4NjQzOTEyMTVlZTJkMTE="})
    Call<CitcallResponse> postCitcall(@Body CitcallModel citcallModel);
}
