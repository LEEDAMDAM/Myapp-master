package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    Button bm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        if( getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("");
        }



        final EditText edit1 = (EditText) findViewById(R.id.edit1);

        Button bm = (Button) findViewById(R.id.save);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 저장
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(NewActivity.this);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("contact_morning", edit1.getText().toString());
                editor.apply();

                Intent intent = new Intent(NewActivity.this, contentActivity.class);
                startActivity(intent);
            }

        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}