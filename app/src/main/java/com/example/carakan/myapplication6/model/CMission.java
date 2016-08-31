package com.example.carakan.myapplication6.model;

import android.support.v4.app.Fragment;

/**
 * Created by carakan on 30.08.2016.
 */
public abstract class CMission {
    public static Integer GetMission(int number)
    {
        int i = number;
        while ((i<9) && (CSaveResults.SaveString.charAt(i)!='n'))
        {
            i=i++;
        }
        return i;
    }
}
