package com.example.todo.src.presentation.screens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.todo.R;


public class DetailsTodoFragment extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // Todo todo = DetailsTodoFragmentArgs.fromBundle(getArguments()).getTodo();
        View view= inflater.inflate(R.layout.fragment_details_todo, container, false);
        // Inflate the layout for this fragment
        return view;
    }
}