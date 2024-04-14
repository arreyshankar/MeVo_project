package com.example.mevo.Utils;

import com.example.mevo.APIs.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    private static final String BASE_URL = "https://mevoexpress.azurewebsites.net/";
    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    API retrofitAPI = retrofit.create(API.class);

    public API getRerofitAPI(){
        return retrofitAPI;
    }
}
