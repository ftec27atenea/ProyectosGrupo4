package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Agosto1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agosto1);
    }
    public void YoQuieroQueHagaEstoCuandoHagaClick(View view){
        EditText tvDato = findViewById(R.id.tvDato);
        TextView MostrarTexto = findViewById(R.id.MostrarTexto);
        MostrarTexto.setText(tvDato.getText());
    }
}