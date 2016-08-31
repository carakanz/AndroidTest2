package com.example.carakan.myapplication6.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.carakan.myapplication6.R;
import com.example.carakan.myapplication6.model.CSaveResults;
import com.example.carakan.myapplication6.presenter.CMainPresenter;
import com.example.carakan.myapplication6.presenter.CPresenterTest;

/**
 * Created by carakan on 29.08.2016.
 */
public class CMainActivity extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CMainPresenter.OnStart(getApplicationContext());
        setContentView(R.layout.main_activity_layout);
    }

    public void onClickNewGame (View view)
    {
        CPresenterTest.NewTest(this);
    }

    public void onClickResumeTest (View viev)
    {
        CPresenterTest.ResumeTest(this);
    }
}
