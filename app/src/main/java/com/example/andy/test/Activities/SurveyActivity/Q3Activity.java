package com.example.andy.test.Activities.SurveyActivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.andy.test.R;
import com.example.andy.test.view.MainScreen;

/**
 * Created by iamph on 12/09/2017.
 */

public class Q3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        Button backBtn = (Button) findViewById(R.id.backBtn);
        Button nextBtn = (Button) findViewById(R.id.nextBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Q3Activity.this, Q2Activity.class));
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Q3Activity.this, MainScreen.class));
            }
        });


    }
}
