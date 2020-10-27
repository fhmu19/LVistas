package com.edu.labvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Laboratorio Vistas");
    }

    public void btn_Inicio(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaUno.class));
    }

    public void btn_atras(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaDiez.class));
    }
}