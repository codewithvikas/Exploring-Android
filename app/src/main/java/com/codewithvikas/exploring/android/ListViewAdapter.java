package com.codewithvikas.exploring.android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<UserInput> {

    ArrayList<UserInput> mUserInputs;
    Context mContext;
    ListViewAdapter(Context context,  ArrayList<UserInput> userInputs){
        super(context,0,userInputs);
        mContext = context;
        mUserInputs = userInputs;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_view_item, parent, false);
        }

        UserInput userInput = mUserInputs.get(position);

            TextView cell1 = listItem.findViewById(R.id.cell1);
            TextView cell2 = listItem.findViewById(R.id.cell2);
        RatingBar ratingBar = listItem.findViewById(R.id.ratingBar);
            cell1.setText(userInput.getName());
            cell2.setText(String.valueOf(userInput.getRoll_no()));
            ratingBar.setRating(userInput.getRating());

        return listItem;
    }
}
