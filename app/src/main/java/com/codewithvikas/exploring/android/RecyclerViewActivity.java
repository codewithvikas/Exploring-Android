package com.codewithvikas.exploring.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ArrayList<UserInput> userInputs = getIntent().getParcelableArrayListExtra("userInputs");

        Log.i(RecyclerViewActivity.class.getSimpleName(),userInputs.toString());

        RecyclerView dynamicTable = findViewById(R.id.dynamic_table_view);

        dynamicTable.setLayoutManager(new LinearLayoutManager(this));
        dynamicTable.setAdapter(new MyRecyclerViewAdapter(userInputs));
    }
}
