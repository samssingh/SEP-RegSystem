package com.example.andy.test.DatabaseModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

import static android.content.ComponentName.readFromParcel;

/**
 * Created by iamph on 15/09/2017.
 */
public class User{
    int uid;
    String name;
    private boolean religion;
    private float knowledge;
    public User(Parcel in)
    {
        readFromParcel(in);
    }
    public User(int uid, String name, boolean religion, float knowledge)
    {
        this.name = name;
        this.uid = uid;
        this.religion = religion;
        this.knowledge = knowledge;
    }


    // [START post_to_map]

    public void set(boolean religion, float knowledge)
    {
        this.religion = religion;
        this.knowledge = knowledge;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("name",name);
        result.put("religion", religion);
        result.put("knowledge", knowledge);
        return result;
    }
    // [END post_to_map]

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{User")
                .append(" identification number=").append(uid)
                .append(", username=").append(name)
                .append(", religion=").append(religion)
                .append(", knowledge=").append(knowledge)
                .append("}").toString();
    }
}
