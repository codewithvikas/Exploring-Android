package com.codewithvikas.exploring.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<UserInput> userInputs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInputs = new ArrayList<>();

        updateUserInput();


    }

    private void updateUserInput() {
        userInputs.add(new UserInput("mohan",2));
        userInputs.add(new UserInput("ram",4));
        userInputs.add(new UserInput("ramesh",6));
        userInputs.add(new UserInput("ali",9));
        userInputs.add(new UserInput("sardar",78));
        userInputs.add(new UserInput("pankaj",9));
        userInputs.add(new UserInput("roshan",20));
    }

    public void openRecyclerViewActivity(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);

        intent.putParcelableArrayListExtra("userInputs",userInputs);
        startActivity(intent);
    }
}
