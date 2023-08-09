package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class sesion_34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Mensajes Grupo4","Inicio Ejecucion");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_34);

        int edad=36;
        double altura =1.70;
        boolean esEstudiante= true;
        String nombre="Nicolas Fiquitiva Segura";



        TextView twEdad=findViewById(R.id.twEdad);
        TextView twAltura=findViewById(R.id.twAltura);
        TextView twEsEstudiante=findViewById(R.id.twEsEstudiante);
        TextView twNombre=findViewById(R.id.twNombre);
        TextView twComparacion=findViewById(R.id.twComparacion);


        Log.i("Mensajes Grupo4","Paso1:"+String.valueOf(edad-1));
        Log.e("Mensajes Grupo4","Paso2:"+String.valueOf((altura-1)));
        Log.w("Mensajes Grupo4","Paso3:"+String.valueOf((altura-1)*50));
        String comparacion;
        if ((edad-1)==((altura-1)*50)){
            comparacion="Verdadero";
        }
        else {
            comparacion="Falso";
        }



        twEdad.setText("Edad:"+edad);
        twAltura.setText("Altura:"+altura);
        twEsEstudiante.setText("Es Estudiante:"+esEstudiante);
        twNombre.setText("Nombre:"+nombre);
        twComparacion.setText("Edad vs Altura:"+comparacion);

        Log.d("Mensajes Grupo4","Termino Ejecucion");
    }

    public void EventoClick(View view){
        Toast.makeText(sesion_34.this,"Hiciste Click",Toast.LENGTH_LONG).show();
    }

    public void Sumar(View view){
        EditText etCampo1=findViewById(R.id.etCampo1);
        EditText etCampo2=findViewById(R.id.etCampo2);
        TextView twResultado=findViewById(R.id.twResultado);
        twResultado.setText("El Resultado es:"+etCampo1.getText()+etCampo2.getText());
    }
}