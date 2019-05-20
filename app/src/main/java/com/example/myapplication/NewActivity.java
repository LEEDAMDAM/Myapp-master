package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    Button bm;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        SharedPreferences pref = getSharedPreferences("pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
            editor.putString("first","id");
            editor.commit();

        Button bm = (Button) findViewById(R.id.save);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this, contentActivity.class);

                EditText edit1 = (EditText) findViewById(R.id.edit1);
                intent.putExtra("contact_morning", edit1.getText().toString());
                startActivity(intent);
            }

        });


    }

}