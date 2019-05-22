package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class new2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);

        Button buttonafter = (Button)findViewById(R.id.save2);
        buttonafter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edit2 = (EditText) findViewById(R.id.edit2) ;

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(new2Activity.this);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("contact_after", edit2.getText().toString());
                editor.apply();

                Intent intent2 = new Intent(new2Activity.this,contentActivity.class);
                startActivity(intent2);
            }


        });
    }
}
