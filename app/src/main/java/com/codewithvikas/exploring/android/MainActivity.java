package com.codewithvikas.exploring.android;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ExerciseListAdapter.ExerciseListAdapterOnClickHandler{

    Toast mToast;
    ExerciseListAdapter mExerciseListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.exercise_list_rv);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         mExerciseListAdapter = new ExerciseListAdapter(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mExerciseListAdapter);

        initExerciseList();

    }
        void initExerciseList(){
            ArrayList<String> exerciseList = new ArrayList<>();
            exerciseList.add("RecyclerView");
            exerciseList.add("Simple Java");
            exerciseList.add("Passing Data Via Intent");

            mExerciseListAdapter.setExerciseList(exerciseList);

        }
    @Override
    public void onExerciseClickHandler(String exercise) {
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(this,"Exercise:"+exercise+" clicked",Toast.LENGTH_SHORT);
        mToast.show();
    }
}
