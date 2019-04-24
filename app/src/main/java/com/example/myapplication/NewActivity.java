package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {
        SharedPreferences sp;

        EditText editTT;
        Button btnSAVE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        initPreferences();
        initView();
        btn_Event();
        loadState();


        Button buttonmoring = (Button)findViewById(R.id.save);
        buttonmoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this,contentActivity.class);

                EditText edit1 = (EditText) findViewById(R.id.edit1) ;
                intent.putExtra("contact_morning", edit1.getText().toString()) ;

                startActivity(intent);
            }

        });


    }

    private void btn_Event() {

        btnSAVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveState();
            }
        });
    }

    private void loadState() {
        editTT.setText(sp.getString("morning",""));
    }
    private void saveState(){
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("morning",editTT.getText().toString());
        editor.commit();

    }
    private void initPreferences() {

    }

    private void initView() {
        editTT=(EditText)findViewById(R.id.edit1);
    }


}
