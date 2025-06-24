package com.example.diaryday.Model


data class RegisterResponse(
    val message: String,
    val userId:Int? = null
)

data class LoginResponse(
    val message: String,
    val accessToken: String?,
    val refreshToken:String?,
    val user: UserInfo?
)

data class UserInfo(
    val id:Int,
    val email:String,
    val firstName:String,
    val lastName:String,
    val uid:String
)

data class LogoutResponse(
    val message: String
)

data class CheckEmailResponse(
    val message: String
)

data class CheckUidResponse(
    val message: String
)

