package com.example.diaryday.API

interface RefreshTokenProvider {
    fun refreshToken(): String?
}
