package com.example.darkmode

import android.content.Context
import android.content.SharedPreferences
class SharedPrefK(context : Context) {
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("filename", Context.MODE_PRIVATE)
    fun setNightMode(state : Boolean){
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean("NightMode", state)
        editor.apply()
    }
    fun loadNightModeState(): Boolean {
        return sharedPreferences.getBoolean("NightMode", false)
    }
}