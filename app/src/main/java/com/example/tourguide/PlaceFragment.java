package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class PlaceFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Adding data to the Arraylist of type word that was user dafined.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Dutch Garden", R.string.dutch_garden, R.drawable.dutch_garden, R.string.dutuch_garden_inf));
        words.add(new Word("Dumas Beach", R.string.dumas_beach, R.drawable.dumas_beach, R.string.dumas_beach_inf));
        words.add(new Word("The Tomb of Khudawand Khan", R.string.khudawand_khan, R.drawable.the_tomb_of_khudawand_khan, R.string.khudawand_khan_inf));
        words.add(new Word("Iskcon Temple", R.string.iskcon_temple, R.drawable.iscon_mall, R.string.iskcon_temple_inf));
        words.add(new Word("Suvali Beach", R.string.suvali_beach, R.drawable.suvali_beach, R.string.suvali_beach_inf));
        words.add(new Word("Surat Castle", R.string.surat_castle, R.drawable.surat_castle, R.string.surat_castle_inf));
        words.add(new Word("Sneh Rashmi Botanical Garden", R.string.botanical_garden, R.drawable.sneh_rashmi_botanical_garden, R.string.botanical_garden_inf));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        //For making list clickable
        listView.setDrawSelectorOnTop(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                Intent i  = new Intent(getActivity(), Information.class);
                i.putExtra("name", word.getName());
                i.putExtra("image", word.getImage());
                i.putExtra("inf", word.getInf());
                startActivity(i);
            }
        });

        return rootView;
    }



}