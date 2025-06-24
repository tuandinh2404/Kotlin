package com.example.diaryday.API

import android.util.Printer
import com.example.diaryday.storage.TokenManager
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(
    private val tokenManager: TokenManager,
    private val refreshTokenProvider: RefreshTokenProvider
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        val accessToken = tokenManager.getAccessToken()
        if (accessToken != null) {
            request = request.newBuilder()
                .addHeader("Authorization", "Bearer $accessToken")
                .build()
        }

        var response = chain.proceed(request)

        if (response.code() == 401) {
            // Token hết hạn → gọi refresh token API
            val newToken = refreshTokenProvider.refreshToken()
            if (newToken != null) {


                request = request.newBuilder()
                    .removeHeader("Authorization")
                    .addHeader("Authorization", "Bearer $newToken")
                    .build()
                response.close() // đóng response cũ
                response = chain.proceed(request)
            } else {
                tokenManager.clearToken()
            }
        }

        return response
    }
}
