package com.example.androidpaging.network;

import com.example.androidpaging.model.StackApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("answers")
    Call<List<StackApiResponse>> getData(
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("site") String site
    );


}
