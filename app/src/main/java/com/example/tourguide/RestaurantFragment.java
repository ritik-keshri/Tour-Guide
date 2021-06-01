package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Adding data to the Arraylist of type word that was user defined.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Sasumaa Gujrati Thali", R.string.sasumaa, R.drawable.sasumaa_gujrati_thali));
        words.add(new Word("Sai Dosa Malhar", R.string.sai_dosa, R.drawable.sai_dosa_malhar));
        words.add(new Word("Mysore Cafe", R.string.mysore_cafe, R.drawable.mysore_cafe));
        words.add(new Word("Only Dhosa", R.string.only_dhosa, R.drawable.only_dosa));
        words.add(new Word("Ramji Damodar Bhajiyawala", R.string.ramji, R.drawable.ramji_damodar_bhajitawala));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}