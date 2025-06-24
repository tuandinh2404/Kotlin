package com.example.diaryday.API

import com.example.diaryday.Model.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @POST("/api-user/register")
    suspend fun register(@Body request: RegisterRequest): Response<RegisterResponse>

    @POST("/api-user/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("/api-user/logout")
    suspend fun logout(@Body request: LogoutRequest): Response<LogoutResponse>

    @POST("/api-user/check-email")
    suspend fun checkEmail(@Body request: CheckEmailRequest): Response<CheckEmailResponse>

    @POST("/api-user/check-uid")
    suspend fun checkUid(@Body request: CheckUidRequest): Response<CheckUidResponse>

    @POST("/api-auth/refresh-token")
    fun refreshToken(@Body request: RefreshTokenRequest): Call<LoginResponse>

    @GET("/api-user/get-uid")
    suspend fun getUID(@Header("Authorization") token: String): Response<CheckUidResponse>

    @GET("/api-user/getusers/{uid}")
    suspend fun getUsers(@Path("uid") uid: String): Response<UserInfo>
}
