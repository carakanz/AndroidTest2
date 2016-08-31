package com.example.carakan.myapplication6.model;

import android.content.SharedPreferences;
import android.content.Context;

/**
 * Created by carakan on 30.08.2016.
 */
public class CSaveResults {
    public static String SaveString;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_NOMBERTEST = "nomberTest";

    private static SharedPreferences settings = null;
    private static SharedPreferences.Editor editor = null;
    private static Context context = null;

    public static void init( Context cntxt ){
        context = cntxt;
    }

    private static void init(){
        settings = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        editor = settings.edit();
    }

    public static void addProperty( String name, String value ){
        if( settings == null ){
            init();
        }
        editor.putString( name, value );
        editor.apply();
    }

    public static String getProperty( String name ){
        if( settings == null ){
            init();
        }
        String tempString = settings.getString( name, null );
        if (tempString==null || tempString.length()!=10)
        {
            tempString="nnnnnnnnnn";
        }
        return tempString;
    }

    public static void Clear() {
        if (editor == null) {
            init();
        }
        editor.clear();
    }
}

