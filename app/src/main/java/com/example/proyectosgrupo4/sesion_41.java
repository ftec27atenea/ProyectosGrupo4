package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sesion_41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_41);
    }

    public void verBrujula(View v){
        Intent mostarBrujula = new Intent(sesion_41.this, sesion_40.class);
        startActivity(mostarBrujula);
    }
}