package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate(fill) the view
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        //For accessing the word from the Word class.
        // gives the index postion.
        Word currentWord = getItem(position);

        //Setting the Image to the ImageView in Activity
        //if image is not present(Phrases Activity) then ImageView will be removed for it.
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImage());

        //Setting the Name to the textview in Activity
        TextView itemText = (TextView) listItemView.findViewById(R.id.name);
        itemText.setText(currentWord.getName());

        //Setting the inf to the textview in Activity
        TextView infText = (TextView) listItemView.findViewById(R.id.address);
        infText.setText(currentWord.getAddress());

        return listItemView;
    }
}
