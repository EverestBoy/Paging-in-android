package com.example.androidpaging.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";
    private static Retrofit retrofit;
    private static RetrofitClientInstance retrofitClientInstance;

   private RetrofitClientInstance(){
       retrofit = new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .build();
   }

   public static synchronized RetrofitClientInstance getInstance(){
       if(retrofitClientInstance == null){
           retrofitClientInstance = new RetrofitClientInstance();
       }
       return retrofitClientInstance;
   }

   public ApiInterface getAPI(){
       return retrofit.create(ApiInterface.class);
   }
}
