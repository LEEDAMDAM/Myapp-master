package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class new3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new3);

        Button buttonafter = (Button)findViewById(R.id.save3);
        buttonafter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(new3Activity.this,contentActivity.class);

                EditText edit3 = (EditText) findViewById(R.id.edit3) ;
                intent3.putExtra("contact_evening", edit3.getText().toString()) ;

                startActivity(intent3);
            }


        });
    }
}
