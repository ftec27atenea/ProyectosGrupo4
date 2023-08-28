package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sesion_44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_44);
        Button btnDetalle = findViewById(R.id.btnDetalle);
        btnDetalle.setOnClickListener(this::mostrarImage);
    }

    public void mostrarImage(View v) {
        ImageView ivSorpresa = findViewById(R.id.ivSorpresa);

        if(ivSorpresa.getVisibility() == View.VISIBLE){
            ivSorpresa.setVisibility(View.GONE);
        }
        else {
            ivSorpresa.setVisibility(View.VISIBLE);
        }
    }
}