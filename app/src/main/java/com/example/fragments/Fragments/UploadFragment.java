package com.example.fragments.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UploadFragment extends Fragment {

    EditText nameET,emailET;



    public UploadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_upload, container, false);
        initUI(myview);
//        Start here





//        end here
        return myview;
    }

    private void initUI(View view) {
        nameET = view.findViewById(R.id.nameET);
        emailET = view.findViewById(R.id.emailET);
    }

}
