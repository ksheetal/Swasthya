package com.example.sheetalkumar.swasthya.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sheetalkumar.swasthya.R;
public class FinDiseaseFragment extends Fragment {


    /*
        @Dev - Sheetal Kumar
        Date - 23 Jan 2019
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  getImages();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fin_disease, container, false);
        return rootView;
    }
}
