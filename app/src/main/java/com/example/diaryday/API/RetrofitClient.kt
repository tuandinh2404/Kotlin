package com.example.diaryday.API

import com.example.diaryday.storage.TokenManager
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(AuthInterceptor(TokenManager, MyRefreshTokenProvider()))
        .build()
    val apiService : ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(ApiConfig.API_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}