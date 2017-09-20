package com.example.andy.test.DatabaseModel;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iamph on 14/09/2017.
 */

public class Survey {
    int sid; // to differentiate between similar surveys
    public String questions[];
    public String answers[];

    //default constructor
    public Survey() {

    }

    //custom constructor
    public Survey(int sid, String questions[], String answers[]) {
        this.sid = sid;
        this.questions = questions;
        this.answers = answers;
    }

    //getter and setter
    public String getAnswer(int sid)
    {
        return answers[sid];
    }


    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("sid", sid);
        result.put("answer1", answers[1]);
        /*
        result.put("question2", questions[2]);
        result.put("question3", questions[3]);

        result.put("answer2", answers[2]);
        result.put("answer3", answers[3]);
        */
        return result;
    }
    // [END post_to_map]


}
