package com.example.Aahaar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vaibhavaingankar on 17/11/15.
 */
public  class PublishItem extends Fragment {
    public static final String ARG_PLANET_NUMBER = "planet_number";

    public PublishItem() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.form, container, false);
       // int i = getArguments().getInt(ARG_PLANET_NUMBER);
       // String planet = getResources().getStringArray(R.array.drawer_item_array)[i];

        //int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
        //         "drawable", getActivity().getPackageName());
        // ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
       // ((TextView)rootView.findViewById(R.id.text1)).setText(imageId);
        //getActivity().setTitle(planet);
        return rootView;
    }
}

