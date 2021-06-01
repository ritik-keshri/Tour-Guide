package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Adding data to the Arraylist of type word that was user dafined.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Dabeli", R.string.dabeli, R.drawable.dabeli));
        words.add(new Word("Fafda", R.string.fafda, R.drawable.fafda));
        words.add(new Word("Locho", R.string.locho, R.drawable.locho));
        words.add(new Word("Khandvi", R.string.khandvi, R.drawable.khandvi));
        words.add(new Word("Khaman", R.string.khaman, R.drawable.khaman));
        words.add(new Word("Gota", R.string.gota, R.drawable.gota));
        words.add(new Word("Muthiya", R.string.muthiya, R.drawable.muthiya));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}