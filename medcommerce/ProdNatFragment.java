package com.example.alexandra.medcommerce;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProdNatFragment extends Fragment {
    View prodNaturiste;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        prodNaturiste=inflater.inflate(R.layout.fragment_prod_nat,container,false);
        return prodNaturiste;
    }
}
