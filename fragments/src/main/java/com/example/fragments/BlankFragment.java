package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View viewinf= inflater.inflate(R.layout.fragment_blank1, container, false);
        viewinf.findViewById(R.id.btnBike).setOnClickListener(v->((MainActivity) getActivity()).loadFrag(new ContainerFragment()));

        viewinf.findViewById(R.id.btnPlane).setOnClickListener(v->((MainActivity) getActivity()).loadFrag(new ContainerFragment()));

        viewinf.findViewById(R.id.btnRail).setOnClickListener(v->((MainActivity) getActivity()).loadFrag(new ContainerFragment()));
        return viewinf;

    }

}
