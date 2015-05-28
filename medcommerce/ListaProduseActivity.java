package com.example.alexandra.medcommerce;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Alexandra on 5/26/2015.
 */
public class ListaProduseActivity extends Activity{

    ListView lv=(ListView)findViewById(android.R.id.list);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listaproduse);
    }


}
