package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

}