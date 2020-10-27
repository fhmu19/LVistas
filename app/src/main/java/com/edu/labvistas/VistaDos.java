package com.edu.labvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VistaDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_dos);
        getSupportActionBar().setTitle("Vista Dos");
    }
    public void btn_Inicio(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaTres.class));
    }

    public void btn_atras(View view) {
        startActivity(new Intent(getApplicationContext(),  VistaUno.class));
    }
}