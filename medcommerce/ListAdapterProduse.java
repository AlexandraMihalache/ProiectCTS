package com.example.alexandra.medcommerce;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alexandra on 5/25/2015.
 */
public class ListAdapterProduse extends BaseAdapter{
    Context context;
    List<ProdusListView> produsRand;

    ListAdapterProduse(Context context, List<ProdusListView> produsRand) {
        this.context = context;
        this.produsRand = produsRand;
    }

    @Override
    public int getCount() {

        return produsRand.size();
    }

    @Override
    public Object getItem(int position) {

        return produsRand.get(position);
    }

    @Override
    public long getItemId(int position) {

        return produsRand.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_adapter, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.imageView);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.numeProdusLV);

        ProdusListView pozitieProdus = produsRand.get(position);
        // setting the image resource and title
        imgIcon.setImageResource(pozitieProdus.getIdButonAdauga());
        txtTitle.setText(pozitieProdus.getDenumire());

        return convertView;

    }
}

