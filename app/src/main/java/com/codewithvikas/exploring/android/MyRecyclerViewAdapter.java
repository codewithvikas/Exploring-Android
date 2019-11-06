package com.codewithvikas.exploring.android;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    ArrayList<UserInput> userInputs;
    MyRecyclerViewAdapter(ArrayList<UserInput> userInputs){
        this.userInputs = userInputs;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemViews = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        return new MyViewHolder(itemViews);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {


        myViewHolder.cell1.setText(userInputs.get(position).getName());
        myViewHolder.cell2.setText(""+userInputs.get(position).getRoll_no());

    }

    @Override
    public int getItemCount() {
        Log.i(MyRecyclerViewAdapter.class.getSimpleName(),"Size:"+userInputs.size());
        return userInputs.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView cell1,cell2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cell1 = itemView.findViewById(R.id.cell1);
            cell2 = itemView.findViewById(R.id.cell2);

        }
    }

}
