package com.example.sybil.athousandwords;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        final String[] description = {
                "xin8ji",
                "xin9ji"
        } ;

        Integer[] imageId = {
                R.drawable.image1,
                R.drawable.image2
        };

        //TODO improve layout in terms of font size and alignment
        final CustomList adapter = new
                CustomList(getActivity(), description, imageId);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_entries);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //String entry = adapter.getItem(position);
                String entry = "detail view";
                Toast.makeText(getActivity(), entry, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, entry);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
