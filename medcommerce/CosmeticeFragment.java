package com.example.alexandra.medcommerce;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CosmeticeFragment extends Fragment{

    View cosmetice;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cosmetice=inflater.inflate(R.layout.fragment_cosmetice,container,false);
        return cosmetice;
    }
}
