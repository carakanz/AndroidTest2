package com.example.carakan.myapplication6.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carakan.myapplication6.R;

/**
 * Created by carakan on 31.08.2016.
 */
public class CFalseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.false_answer, null);
    }
}
