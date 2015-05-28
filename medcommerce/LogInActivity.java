package com.example.alexandra.medcommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Comparator;


public class LogInActivity extends Activity {
    Spinner spinnerOras,spinnerSector;
    ArrayAdapter<CharSequence> adaptorOrase,adaptorSectoare;
    TextView tvSector;
    Button butonLogIn;
    RadioGroup radioGr;
    RadioButton rbFemeie,rbBarbat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        butonLogIn=(Button)findViewById(R.id.buttonLogIn);
        tvSector=(TextView)findViewById(R.id.textViewSector);
        spinnerSector=(Spinner)findViewById(R.id.spinnerSector);
        spinnerOras=(Spinner)findViewById(R.id.spinnerLocalitate);
        //imi creez un ArrayAdapter cu localitatile si altul cu sectoarele Bucurestiului
        adaptorOrase=ArrayAdapter.createFromResource(LogInActivity.this,R.array.orase_Romania,android.R.layout.simple_spinner_item);
        adaptorSectoare=ArrayAdapter.createFromResource(LogInActivity.this, R.array.sectoare_Bucuresti,android.R.layout.simple_spinner_item);
        //imi sortez vectorul de orase alfabetic
        adaptorOrase.sort(new Comparator<CharSequence>() {
            @Override
            public int compare(CharSequence element1, CharSequence element2) {
                String el1, el2;
                el1 = element1.toString();
                el2 = element2.toString();
                return el1.compareToIgnoreCase(el2);
            }
        });
        adaptorOrase.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerOras.setAdapter(adaptorOrase);

        adaptorSectoare.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerSector.setAdapter(adaptorSectoare);

        spinnerOras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinnerOras.getSelectedItemPosition() == 9) {
                    /*Toast t1=Toast.makeText(LogInActivity.this,"Bucure?ti",Toast.LENGTH_LONG);
                    t1.show();*/
                    tvSector.setVisibility(View.VISIBLE);
                    spinnerSector.setVisibility(View.VISIBLE);
                } else {
                    tvSector.setVisibility(View.INVISIBLE);
                    spinnerSector.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        radioGr=(RadioGroup)findViewById(R.id.radioGr);
        rbFemeie=(RadioButton)findViewById(R.id.radioButtonF);
        rbBarbat=(RadioButton)findViewById(R.id.radioButtonM);
        radioGr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
              int radioGrSelectat= radioGr.getCheckedRadioButtonId();
                switch (checkedId)
                {
                    case R.id.radioButtonM:

                        break;
                    case R.id.radioButtonF:

                        break;
                }
            }
        });


        //butonul de LogIn
        butonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LogInActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activitate_log_in, menu);
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
