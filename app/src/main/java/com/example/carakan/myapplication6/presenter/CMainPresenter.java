package com.example.carakan.myapplication6.presenter;

import com.example.carakan.myapplication6.model.CSaveResults;
import com.example.carakan.myapplication6.view.CMainActivity;
import android.content.Context;

/**
 * Created by carakan on 30.08.2016.
 */
public class CMainPresenter {

    public static void OnStart(Context cntxt) {
        CSaveResults.init(cntxt);
        CSaveResults.SaveString=CSaveResults.getProperty(CSaveResults.APP_PREFERENCES_NOMBERTEST);
    }
}
