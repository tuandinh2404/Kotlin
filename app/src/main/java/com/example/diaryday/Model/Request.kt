package com.example.diaryday.Model

data class RegisterRequest(
    val email: String,
    val password: String,
    val firstName:String,
    val lastName:String,
    val uid: String
)

data class LoginRequest(
    val email:String,
    val password: String,
)

data class LogoutRequest(
    val refreshToken:String
)

data class CheckEmailRequest(
    val email: String
)

data class CheckUidRequest(
    val uid: String
)

data class RefreshTokenRequest(
    val refreshToken: String
)
