package com.example.carakan.myapplication6.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.carakan.myapplication6.R;
import com.example.carakan.myapplication6.presenter.CPresenterMission;
import com.example.carakan.myapplication6.presenter.CPresenterTest;

/**
 * Created by carakan on 30.08.2016.
 */


public class CTestActivity extends Activity {

    CQuestionFragment FQuestion;
    CAnswerFragment FAnswer;
    CButtonNextFragment FButtonNext;
    CTrueFragment FTrue;
    CFalseFragment FFalse;
    CHintFragment FHint;

    android.app.FragmentTransaction fTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fTrans = getFragmentManager().beginTransaction();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_layout);
        CPresenterMission.NextMission(this);
        FButtonNext = new CButtonNextFragment();
        FTrue = new CTrueFragment();
        FFalse = new CFalseFragment();
        NewQuestion();
    }


    public void onClickAnswer1(View view) {
        CPresenterMission.Answer(1);
        Answer();
    }

    public void onClickAnswer2(View view) {
        CPresenterMission.Answer(2);
        Answer();
    }

    public void onClickAnswer3(View view) {
        CPresenterMission.Answer(3);
        Answer();
    }

    public void onClickAnswer4(View view) {
        CPresenterMission.Answer(2);
        Answer();
    }

    private void NewQuestion() {
        fTrans = getFragmentManager().beginTransaction();
        FQuestion = new CQuestionFragment();
        FAnswer = new CAnswerFragment();
        fTrans.replace(R.id.QuestionFragment, FQuestion);
        fTrans.replace(R.id.AnswerFragment, FAnswer);
        fTrans.remove(FButtonNext);
        fTrans.commit();
    }

    private void Answer()
    {
        fTrans = getFragmentManager().beginTransaction();
        if (CPresenterMission.TrueOrFalse)
        fTrans.replace(R.id.TrueOrFalse,FTrue);
        else fTrans.replace(R.id.TrueOrFalse,FFalse);
        FHint=new CHintFragment();
        fTrans.replace(R.id.QuestionFragment, FHint);
        fTrans.remove(FAnswer);
        fTrans.replace(R.id.NextQuestionFragment, FButtonNext);
        fTrans.commit();
    }
    public void onClickNext(View view)
    {

    }
}
