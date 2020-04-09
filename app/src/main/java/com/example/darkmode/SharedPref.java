package com.example.darkmode;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    SharedPreferences sharedPref;
    public SharedPref(Context context){
        sharedPref = context.getSharedPreferences("filename", Context.MODE_PRIVATE);
    }
    public void setNightMode(Boolean state){
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("NightMode", state);
        editor.apply();
    }
    public Boolean loadNightModeState(){
        Boolean state = sharedPref.getBoolean("NightMode", false);
        return state;
    }
}
