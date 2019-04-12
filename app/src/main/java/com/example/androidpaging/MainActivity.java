package com.example.androidpaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidpaging.model.StackApiResponse;
import com.example.androidpaging.network.RetrofitClientInstance;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<StackApiResponse> call =
                RetrofitClientInstance.getRetrofit()
                .getA

    }
}
