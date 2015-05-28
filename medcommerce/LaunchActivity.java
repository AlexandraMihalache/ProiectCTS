package com.example.alexandra.medcommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Thread timpRepaus=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{  //se executa indiferent daca se executa blocul de try sau catch
                    Intent i=new Intent(LaunchActivity.this,LogInActivity.class);
                    startActivity(i);
                }
            }
        };
        timpRepaus.start();
    }

    //metoda onPause - ca activitatea Launch sa nu mai consume mem odata ce se trece la activitatea de home

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        overridePendingTransition(android.R.anim.fade_in, 0);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
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
