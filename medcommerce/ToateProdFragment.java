package com.example.alexandra.medcommerce;

import android.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ToateProdFragment extends ListFragment implements OnItemClickListener {

    String[] denProduse;
    TypedArray imaginiButonAdaugaCos;

    ListAdapter adapter;
    private List<ProdusListView> listaProduse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.listaproduse, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        denProduse = getResources().getStringArray(R.array.denProduse);
        imaginiButonAdaugaCos = getResources().obtainTypedArray(R.array.imagini);


        listaProduse = new ArrayList<ProdusListView>();

        for (int i = 0; i < denProduse.length; i++) {
            ProdusListView items = new ProdusListView(denProduse[i],imaginiButonAdaugaCos.getResourceId(
                    i, -1));

            listaProduse.add(items);
        }

        adapter = new ListAdapterProduse(getActivity(), listaProduse);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), denProduse[position], Toast.LENGTH_LONG)
                .show();

    }
}
