package com.example.carakan.myapplication6.presenter;

import android.app.Activity;

import com.example.carakan.myapplication6.model.CMission;

/**
 * Created by carakan on 31.08.2016.
 */
public abstract class CPresenterMission {
    public static Integer number=0;
    public static Integer numberTrue=1;
    public static boolean TrueOrFalse;

    public static void NextMission(Activity activity)
    {
        number = CMission.GetMission(number);

    }

    public static void Answer(Integer i)
    {
        if (i == numberTrue)
        {
            TrueOrFalse=true;
        }
        else TrueOrFalse=false;
    }

    public static void TrueMission()
    {

    }

    public static void FalseMission()
    {

    }
    //CMission.GetMission(number, numberTrue, question, answer);
}
