package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class contentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);


        Intent intent = getIntent();
        TextView tv1 = (TextView) findViewById(R.id.tv1) ;
        String morning = intent.getStringExtra("contact_morning") ;
        if (morning != null)
            tv1.setText(morning) ;

        Intent intent2 = getIntent();
        TextView tv2 = (TextView) findViewById(R.id.tv2) ;
        String after = intent2.getStringExtra("contact_after") ;
        if (after != null)
            tv2.setText(after) ;

        Intent intent3 = getIntent();
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        String evening = intent3.getStringExtra("contact_evening") ;
        if (evening != null)
            tv3.setText(evening) ;


    }
}
