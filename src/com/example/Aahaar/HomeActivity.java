package com.example.Aahaar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vaibhavaingankar on 18/11/15.
 */
public class HomeActivity extends Fragment {

    ImageButton floatingAdd;
    public HomeActivity() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);

        floatingAdd = (ImageButton)rootView.findViewById(R.id.addDishButton);
        floatingAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment form = new PublishItem();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame,form).commit();
            }
        });

        final ListView listview = (ListView) rootView.findViewById(R.id.bestRestaurantListView);
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listview.setAdapter(adapter);
        return rootView;
    }
}


