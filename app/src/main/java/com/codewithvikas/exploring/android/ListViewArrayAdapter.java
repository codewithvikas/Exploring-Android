package com.codewithvikas.exploring.android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewArrayAdapter extends ArrayAdapter<Artikel> {
    Context mContext;
    ArrayList<Artikel> mArtikels;
    public ListViewArrayAdapter(@NonNull Context context, @NonNull ArrayList<Artikel> artikels) {
        super(context, 0, artikels);
        mContext = context;
        mArtikels = artikels;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem ==null){
            listItem = LayoutInflater.from(mContext).inflate(R.layout.artikel_list_item,parent,false);
        }
        Artikel artikel = mArtikels.get(position);

        ImageView imageView = listItem.findViewById(R.id.imageView);
        TextView title = listItem.findViewById(R.id.textTitle);
        TextView time = listItem.findViewById(R.id.textTime);
        TextView disc = listItem.findViewById(R.id.textDesc);
        RatingBar ratingBar = listItem.findViewById(R.id.ratingBar);

        imageView.setImageResource(artikel.getImageId());
        title.setText(artikel.getTitle());
        time.setText(artikel.getTimestamp());
        disc.setText(artikel.getDescriptions());

        ratingBar.setRating(artikel.getRatingId());

        return listItem;
    }
}
