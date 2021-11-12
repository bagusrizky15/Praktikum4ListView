package com.example.praktikum4_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpel = (Button) findViewById(R.id.btn_simpel);
        btnSimpel.setOnClickListener(this);

        Button btnCustom = (Button) findViewById(R.id.btn_custom);
        btnCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class<?> action Class = null;
        if(v.getId() == R.id.btn_simpel){


        } else if(v.getId() == R.id.btn_custom){

        }

    }
}