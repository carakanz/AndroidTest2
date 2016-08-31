package com.example.carakan.myapplication6.presenter;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.carakan.myapplication6.model.CMission;
import com.example.carakan.myapplication6.model.CSaveResults;
import com.example.carakan.myapplication6.view.CTestActivity;

/**
 * Created by carakan on 30.08.2016.
 */
public abstract class CPresenterTest{
    public static CSaveResults SaveResults;
    public static void NewTest(Activity activity)
    {
        CSaveResults.Clear();
        CSaveResults.SaveString="nnnnnnnnnn";
        ResumeTest(activity);
    }

    public static void ResumeTest(Activity activity)
    {
        Intent GoToNewTest = new Intent(activity, CTestActivity.class);
        activity.startActivity(GoToNewTest);
    }


}
