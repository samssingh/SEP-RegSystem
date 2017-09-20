package com.example.andy.test.Activities.SurveyActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.andy.test.DatabaseModel.User;
import com.example.andy.test.R;

/**
 * Created by iamph on 12/09/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

public class Q2Activity extends AppCompatActivity {

    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Button backBtn = (Button) findViewById(R.id.backBtn);
        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        boolean hasKeyName = getIntent().hasExtra("name");

        Log.i("name","Bundle has key name");
        ratingBar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                startActivity(new Intent(Q2Activity.this, Q3Activity.class));
                return true;
            }
        });

        float rating = ratingBar.getRating();


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Q2Activity.this, Q1Activity.class));
            }
        });
    }
}
