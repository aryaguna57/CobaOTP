package com.cobacoba.cobaotp;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConectionManager {

    private static final String TAG = "ConectionManager";

    public static void postcitCall(CitcallModel model, final SingleDataConnectionListener<CitcallResponse> listener){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gateway.citcall.com/v3/call")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CitCallAPI citCallAPI = retrofit.create(CitCallAPI.class);
        Call<CitcallResponse> call = citCallAPI.postCitcall(model);

        call.enqueue(new Callback<CitcallResponse>() {
            @Override
            public void onResponse(Call<CitcallResponse> call, Response<CitcallResponse> response) {
                Log.d(TAG, "onResponse: Berhasil");
                listener.onSuccess(response.body(),"Berhasil");
            }

            @Override
            public void onFailure(Call<CitcallResponse> call, Throwable t) {
                Log.d(TAG, "onResponse: Gagal");
                listener.onFailed("Gagal");
            }
        });
    }

}
