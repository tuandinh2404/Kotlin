package com.example.diaryday.storage

import android.content.Context
import android.content.SharedPreferences


object TokenManager {
    private lateinit var appContext: Context

    fun init(context: Context) {
        appContext = context.applicationContext
    }

    private const val PREF_NAME="diary_prefs"
    private const val ACCESS_TOKEN_KEY="access_token"
    private const val REFRESH_TOKEN_KEY="refresh_token"
    private const val UID_KEY="uid"

    private fun getPrefs(): SharedPreferences {
        return appContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveAccessToken(token: String) {
        getPrefs().edit().putString(ACCESS_TOKEN_KEY, token).apply()
    }
    fun getAccessToken(): String? {
        return getPrefs().getString(ACCESS_TOKEN_KEY, null)
    }

    fun saveRefreshToken(token: String) {
        getPrefs().edit().putString(REFRESH_TOKEN_KEY, token).apply()
    }
    fun getRefreshToken(): String? {
        return getPrefs().getString(REFRESH_TOKEN_KEY, null)
    }

    fun clearToken() {
        getPrefs().edit()
            .remove(ACCESS_TOKEN_KEY)
            .remove(REFRESH_TOKEN_KEY)
            .apply()
    }
}