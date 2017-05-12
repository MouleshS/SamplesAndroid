package com.codepath.customprogressbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.progressBar) GoalProgressBar progressBar;

    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        progressBar.setUnfilledSectionColor(Color.RED);
        //progressBar.setGoal(100);

        if (savedInstanceState == null) {
            resetProgress();
        }
    }

    @OnClick(R.id.resetProgressBtn)
    public void resetProgress() {
        int prog = random.nextInt(100);
        progressBar.setProgress(20);
    }
}
