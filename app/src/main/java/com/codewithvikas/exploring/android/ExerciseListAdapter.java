package com.codewithvikas.exploring.android;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ExerciseViewHolder> {

    ArrayList<String> mExerciseList;
    ExerciseListAdapter(ArrayList<String> exerciseNameList){
        mExerciseList = exerciseNameList;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mExerciseList.size();
    }

    static class ExerciseViewHolder extends RecyclerView.ViewHolder{

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
