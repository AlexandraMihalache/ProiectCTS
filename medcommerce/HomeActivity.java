package com.example.alexandra.medcommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class HomeActivity extends Activity {

    ImageButton btnCont,btnProduse,btnComenzi,btnCos,btnReduceri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnComenzi=(ImageButton)findViewById(R.id.imageButtonComenzi);
        btnCont=(ImageButton)findViewById(R.id.imageButtonCont);
        btnCos=(ImageButton)findViewById(R.id.imageButtonCosulMeu);
        btnProduse=(ImageButton)findViewById(R.id.imageButtonProduse);
        btnReduceri=(ImageButton)findViewById(R.id.imageButtonReduceri);

        btnComenzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,ComenziActivity.class);
                startActivity(i);
            }
        });

        btnCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,ContulMeuActivity.class);
                startActivity(i);
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,CosulMeuActivity.class);
                startActivity(i);
            }
        });

        btnProduse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,ProduseActivity.class);
                startActivity(i);
            }
        });

        btnReduceri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,ReduceriActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
