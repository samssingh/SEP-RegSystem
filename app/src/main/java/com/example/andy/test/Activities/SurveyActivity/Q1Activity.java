package com.example.andy.test.Activities.SurveyActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.andy.test.DatabaseModel.User;
import com.example.andy.test.R;
import com.example.andy.test.view.MainScreen;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import static java.sql.DriverManager.println;

/**
 * Created by iamph on 12/09/2017.
 */

public class Q1Activity extends AppCompatActivity {
    //declare items
    private RadioButton yesRadBtn;
    private RadioButton noRadBtn;
    private Button backBtn;
    //declare new user
    User user;

    // [START declare_database_ref]
    //private DatabaseReference mDatabase;
    // [END declare_database_ref]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("creating","ACTIVITY CREATED MANNNNNNNNNNNNNNNNNNNN");
        setContentView(R.layout.activity_q1);
        //find item on view
        backBtn = (Button) findViewById(R.id.backBtn);
        yesRadBtn = (RadioButton) findViewById(R.id.yesRadBtn);
        noRadBtn = (RadioButton) findViewById(R.id.noRadBtn);
        //find view and intent
        View view = findViewById(R.id.activity_q1);
        getIntent().putExtra("religion",true);
        getIntent().putExtra("name","name");
        //currentIntent.getExtras();


        // [START initialize_database_ref]
        //mDatabase = FirebaseDatabase.getInstance().getReference();
        // [END initialize_database_ref]



        //implement change activity on radio button checked
        yesRadBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //Change activity
                    startActivity(new Intent(Q1Activity.this,Q2Activity.class));
                }
            }
        });

        noRadBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //Change activity
                    startActivity(new Intent(Q1Activity.this,Q2Activity.class));

                }
            }
        });


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Q1Activity.this, MainScreen.class));
            }
        });


    }
}
