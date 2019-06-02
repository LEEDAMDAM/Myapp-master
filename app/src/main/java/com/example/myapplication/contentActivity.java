package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class contentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

        if( getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("");
        }


        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String morning = pref.getString("contact_morning", null);
        String after = pref.getString("contact_after",null);
        String evening = pref.getString("contact_evening",null) ;


        final Intent intent = getIntent();
        TextView tv1 = (TextView) findViewById(R.id.tv1) ;
        if (morning != null)
            tv1.setText(morning);

        Intent intent2 = getIntent();
        TextView tv2 = (TextView) findViewById(R.id.tv2) ;
        if (after != null)
            tv2.setText(after) ;

        Intent intent3 = getIntent();
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        if (evening != null)
            tv3.setText(evening) ;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),MemoActivity.class);
                startActivity(intent3);

            }
        };
        Button btnback = (Button) findViewById(R.id.back);
        btnback.setOnClickListener(listener);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }



}
