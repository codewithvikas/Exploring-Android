package com.codewithvikas.exploring.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<UserInput> userInputs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        updateUserInput();

        RecyclerView dynamicTable = findViewById(R.id.dynamic_table_view);

        dynamicTable.setLayoutManager(new LinearLayoutManager(this));
        dynamicTable.setAdapter(new MyRecyclerViewAdapter(userInputs));
    }

    private void updateUserInput() {
        userInputs = new ArrayList<>();
        userInputs.add(new UserInput("mohan",2));
        userInputs.add(new UserInput("ram",4));
        userInputs.add(new UserInput("ramesh",6));
        userInputs.add(new UserInput("ali",9));
        userInputs.add(new UserInput("sardar",78));
        userInputs.add(new UserInput("pankaj",9));
        userInputs.add(new UserInput("roshan",20));
    }

}
