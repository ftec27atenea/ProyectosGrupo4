package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.widget.TextView;

public class sesion_46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_46);

        TextView texto = findViewById(R.id.textView12);
        texto.setText("Elemento encontrado");
    }
}