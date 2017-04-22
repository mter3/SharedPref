package com.example.memoo.lesson1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by memoo on 22.4.2017.
 */

public class benimicinkaydet {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public benimicinkaydet(Context context)//kurucu fonksiyon
    {

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);
        editor=sharedPreferences.edit();

    }


    public void kaydet(String key,String value)
    {
        editor.putString(key,value);
        editor.commit();

    }

    public String yukle(String key)
    {
        return sharedPreferences.getString(key,"");
    }
}
