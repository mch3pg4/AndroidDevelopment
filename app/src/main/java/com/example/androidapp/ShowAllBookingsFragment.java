package com.example.androidapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ShowAllBookingsFragment extends Fragment {

    Button doneButton;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_show_all_bookings, container, false);

    doneButton = (Button) view.findViewById(R.id.doneBtn);
    doneButton.setOnClickListener(v -> {
        HomeFragment homeFragment = new HomeFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).commit();
    });


        return view;
}}