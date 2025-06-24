package com.example.diaryday.API

import com.example.diaryday.Model.RefreshTokenRequest
import com.example.diaryday.storage.TokenManager
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRefreshTokenProvider : RefreshTokenProvider {
    override fun refreshToken(): String? {
        val refreshToken = TokenManager.getRefreshToken() ?: return null
        val response = Retrofit.Builder()
            .baseUrl(ApiConfig.API_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
            .refreshToken(RefreshTokenRequest(refreshToken))
            .execute()

        if(response.isSuccessful) {
            val newAccessToken = response.body()?.accessToken
            return newAccessToken
        }
        return null
    }
}