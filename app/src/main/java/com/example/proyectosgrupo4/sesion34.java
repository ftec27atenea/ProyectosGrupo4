package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;
import android.view.View;

public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion34);

        int edad = 21;
        double altura = 1.73;
        boolean esEstudiante = true;
        String nombre = "John Nicolas Fajardo Jerez";
        String comparacion;

        TextView twEdad = findViewById(R.id.edad);
        TextView twAltura = findViewById(R.id.altura);
        TextView twEsEstudiante = findViewById(R.id.esEstudiante);
        TextView twNombre = findViewById(R.id.nombre);
        TextView twComparacion = findViewById(R.id.comparacion);



        if(edad == altura){
            comparacion = "Verdadero";
        } else {
            comparacion = "Falso";
        }

        twEdad.setText("Edad: " + String.valueOf(edad));
        twAltura.setText("Altura: " + String.valueOf(altura));
        twEsEstudiante.setText("¿Es estudiante?: " + String.valueOf(esEstudiante));
        twNombre.setText("Nombre: " + nombre);
        twComparacion.setText("Comparación: " + comparacion);

    }
    public void sumar(View view){
        EditText etElemento1 = findViewById(R.id.element1);
        EditText etElemento2 = findViewById(R.id.element2);

        String elemento1 = etElemento1.getText().toString();
        String elemento2 = etElemento2.getText().toString();

        String mensaje = etElemento1.getText().toString() + etElemento2.getText().toString();

        if(mensaje == ""){
            mensaje = "¡Ingresa dos entradas para concatenar!";
        }

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();

    }




}