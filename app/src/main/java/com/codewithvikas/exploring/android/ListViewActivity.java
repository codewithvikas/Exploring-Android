package com.codewithvikas.exploring.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ArrayList<UserInput> userInputs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        updateUserInput();

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(new ListViewAdapter(this,userInputs));
    }

    private void updateUserInput() {
        userInputs = new ArrayList<>();
        userInputs.add(new UserInput("mohan",2,1));
        userInputs.add(new UserInput("ram",4,3));
        userInputs.add(new UserInput("ramesh",6,2));
        userInputs.add(new UserInput("ali",9,4));
        userInputs.add(new UserInput("sardar",78,0));
        userInputs.add(new UserInput("pankaj",9,5));
        userInputs.add(new UserInput("roshan",20,0));
    }

}
