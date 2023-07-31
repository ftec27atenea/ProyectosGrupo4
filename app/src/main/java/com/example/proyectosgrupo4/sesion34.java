package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion34);

        int edad = 53;
        double altura = 1.73;
        boolean esEstudiante = false;
        String nombre = "Martin Dario Daza Garzón";

        TextView tvEdad = findViewById(R.id.tvEdad);
        TextView tvAltura = findViewById(R.id.tvAltura);
        TextView tvEstudiante = findViewById(R.id.tvEstudiante);
        TextView tvNombre = findViewById(R.id.tvNombre);

        String esEstudianteTexto;

        if (esEstudiante) {
            esEstudianteTexto = "Si";
        } else {
            esEstudianteTexto = "No";
        }

        tvEdad.setText("Edad: " + String.valueOf(edad));
        tvAltura.setText("Altura: " + String.valueOf(altura));
        tvEstudiante.setText("Estudiante: " + esEstudianteTexto);
        tvNombre.setText("Nombre: " + nombre);

        Log.d("Mensaje Grupo4", "Mensaje de prueba");
    }
}