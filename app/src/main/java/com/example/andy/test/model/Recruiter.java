package com.example.andy.test.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andy.test.view.Loginpage;
import com.example.andy.test.R;

public class Recruiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruiter);

        Button button  = (Button) findViewById(R.id.button19);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Recruiter.this, Loginpage.class));
            }
        });


    }
}
