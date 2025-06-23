package com.example.diaryday.storage

import android.content.Context
import android.content.SharedPreferences


object TokenManager {
    private const val PREF_NAME="diary_prefs"
    private const val ACCESS_TOKEN_KEY="access_token"
    private const val REFRESH_TOKEN_KEY="refresh_token"
    private const val UID_KEY="uid"

    private fun getPrefs(context:Context): SharedPreferences {
        return.context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveAccessToken(context: Context, token: String) {
        getPrefs(context).edit().putString(ACCESS_TOKEN_KEY, token).apply()
    }
    fun getAccessToken(context: Context): String? {
        return getPrefs(context).getString(ACCESS_TOKEN_KEY, null)
    }

    fun saveRefreshToken(context: Context,token: String) {
        getPrefs(context).edit().getString(REFRESH_TOKEN_KEY, token).apply()
    }
    fun getRefreshToken(context: Context): String? {
        return getPrefs(context).getString(REFRESH_TOKEN_KEY, null)
    }

    fun clearToken(context: Context) {
        getPrefs(context).edit()
            .remove(ACCESS_TOKEN_KEY)
            .remove(REFRESH_TOKEN_KEY)
            .apply()
    }
}