package com.abhijeet14.tinadmin.fragments;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhijeet14.tinadmin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
private View v;
private AppCompatActivity a;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home,container,false);
        a = (AppCompatActivity) getActivity();
        a.getSupportActionBar().setTitle("Home");
        NavigationView nav = a.findViewById(R.id.nav_view);
        nav.setCheckedItem(R.id.nav_home);
        return v;
    }

}
