package com.example.darkmode

import android.content.Context
import android.content.SharedPreferences;
class SharedPrefK {
    var sharedPreferences: SharedPreferences? = null
    fun SharedPrefK(conext : Context){
         sharedPreferences = conext.getSharedPreferences("filename", Context.MODE_PRIVATE)

    }
    fun setNightMode(state : Boolean){
       val editor = sharedPreferences!!.edit()
        editor.putBoolean("NightMode", state)
        editor.apply();
    }
    fun loadNightModeState(): Boolean {
        val state: Boolean = sharedPreferences!!.getBoolean("NightMode", false)
        return state;
    }
}