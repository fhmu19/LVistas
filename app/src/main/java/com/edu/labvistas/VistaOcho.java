package com.edu.labvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VistaOcho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_ocho);
        getSupportActionBar().setTitle("Vista Ocho");
    }
    public void btn_Inicio(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaNueve.class));
    }

    public void btn_atras(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaSiete.class));
    }
}