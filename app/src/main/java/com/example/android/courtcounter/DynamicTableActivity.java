package com.example.android.courtcounter;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class DynamicTableActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_table);
        ArrayList<UserInput> userInputs = getIntent().getParcelableArrayListExtra("userInputs");

        Log.i(DynamicTableActivity.class.getSimpleName(),userInputs.toString());

        RecyclerView dynamicTable = findViewById(R.id.dynamic_table_view);

        dynamicTable.setLayoutManager(new LinearLayoutManager(this));
        dynamicTable.setAdapter(new MyTableAdapter(userInputs));
    }
}
