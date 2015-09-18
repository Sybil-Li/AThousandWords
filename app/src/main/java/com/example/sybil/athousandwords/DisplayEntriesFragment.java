package com.example.sybil.athousandwords;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayEntriesFragment extends Fragment {

    private ArrayAdapter<String> displayEntriesAdapter;

    public DisplayEntriesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] description = {
                "xin8ji",
                "xin9ji"
        } ;

        Integer[] imageId = {
                R.drawable.image1,
                R.drawable.image2
        };

        //TODO customize list to show both picture and text
        CustomList adapter = new
                CustomList(getActivity(), description, imageId);


        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_entries);
        listView.setAdapter(adapter);
        //list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        return rootView;
    }
}
