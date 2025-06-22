package com.example.diaryday.API

object ApiConfig {
    const val API_BASE = "http://10.0.2.2:3000"
    const val API_WSK = "ws://10.0.2.2:8090"

    const val Register = "$API_BASE/api-user/register"
    const val Login = "$API_BASE/api-user/login"
    const val LogOut = "$API_BASE/api-user/logout"
    const val checkEmail = "$API_BASE/api-user/check-email"
    const val checkEmailLogin = "$API_BASE/api-user/check-email-login"
    const val checkUid = "$API_BASE/api-user/check-uid"
    const val refreshToken = "$API_BASE/api-auth/refresh-token"
    const val getUID = "$API_BASE/api-user/get-uid"
    const val getUsers = "$API_BASE/api-user/getusers"
    const val getImages = "$API_BASE/api-image/images"
    const val getImagesUid = "$API_BASE/api-image/get-images"
    const val wedSocket = API_WSK
}