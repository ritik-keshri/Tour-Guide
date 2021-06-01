package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView  = inflater.inflate(R.layout.word_list, container, false);

        //Adding data to the Arraylist of type word that was user dafined.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("VR Mall", R.string.vr_mall, R.drawable.dumas_beach));
        words.add(new Word("Rahul Raj Mall", R.string.rahul_raj, R.drawable.rahul_raj_mall));
        words.add(new Word("Iscon Mall", R.string.iscon_mall, R.drawable.iscon_mall));
        words.add(new Word("Central Mall", R.string.central_mall, R.drawable.central_mall));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}