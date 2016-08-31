package com.example.carakan.myapplication6.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carakan.myapplication6.R;
import com.example.carakan.myapplication6.presenter.CPresenterMission;

/**
 * Created by carakan on 31.08.2016.
 */
public class CHintFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        switch (CPresenterMission.number)
        {
            case 1:
                view = inflater.inflate(R.layout.hint1, null);
                break;
            default:
                view= inflater.inflate(R.layout.hint1, null);
                break;
        }
        return view;
    }
}