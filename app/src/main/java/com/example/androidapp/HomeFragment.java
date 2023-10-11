package com.example.androidapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    Button createBookingButton;
    TextView seeAllBookingsButton;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_home, container, false);

        createBookingButton = (Button) view.findViewById(R.id.createABookingButton);
        createBookingButton.setOnClickListener(v -> {

            CreateBookingFragment createBookingFragment = new CreateBookingFragment();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, createBookingFragment).commit();

    });

        seeAllBookingsButton = (TextView) view.findViewById(R.id.see_all_text);
        seeAllBookingsButton.setOnClickListener(v -> {

            ShowAllBookingsFragment showAllBookingsFragment = new ShowAllBookingsFragment();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, showAllBookingsFragment).commit();

        });


        return view;
        }}
