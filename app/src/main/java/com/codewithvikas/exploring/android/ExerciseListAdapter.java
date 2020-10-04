package com.codewithvikas.exploring.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ExerciseViewHolder> {

    ArrayList<String> mExerciseList;
    ExerciseListAdapterOnClickHandler mExerciseListAdapterOnClickHandler;
    ExerciseListAdapter(ExerciseListAdapterOnClickHandler exerciseListAdapterOnClickHandler){
        mExerciseListAdapterOnClickHandler = exerciseListAdapterOnClickHandler;
    }

    interface ExerciseListAdapterOnClickHandler{
        void onExerciseClickHandler(String exercise);
    }
    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.exercise_list_item,parent,false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
            holder.bindView(mExerciseList.get(position));
    }

    public void setExerciseList(ArrayList<String> mExerciseList) {
        this.mExerciseList = mExerciseList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mExerciseList.size();
    }


     class ExerciseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView exerciseTv;
        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            exerciseTv = itemView.findViewById(R.id.exercise_tv);
            itemView.setOnClickListener(this);
        }

        void bindView(String exercise){
            exerciseTv.setText(exercise);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            mExerciseListAdapterOnClickHandler.onExerciseClickHandler(mExerciseList.get(position));

        }
    }
}
