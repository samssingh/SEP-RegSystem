package com.example.andy.test.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andy.test.R;
import com.example.andy.test.Activities.AdminActivity;
import com.example.andy.test.Activities.RecruiterActivity;
import com.example.andy.test.Activities.StudentActivity;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        Button button  = (Button) findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Loginpage.this, AdminActivity.class));
            }
        });

        Button recruiter  = (Button) findViewById(R.id.button16);

        recruiter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Loginpage.this, RecruiterActivity.class));
            }
        });

        Button student  = (Button) findViewById(R.id.button10);

        student.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Loginpage.this, StudentActivity.class));
            }
        });

        Button toMain  = (Button) findViewById(R.id.button6);

        toMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Loginpage.this, MainScreen.class));
            }
        });
    }
}
