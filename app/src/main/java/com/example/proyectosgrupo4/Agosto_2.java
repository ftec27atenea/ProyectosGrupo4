package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Agosto_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agosto2);
    }

    public void login(View view) {
        EditText Usuario = findViewById(R.id.nombre);
        EditText Contraseña = findViewById(R.id.contraseña);
        String Respuesta = autenticar(Usuario.getText().toString(), Contraseña.getText().toString());
        Toast.makeText(getApplicationContext(), Respuesta, Toast.LENGTH_LONG).show();
    }

    String autenticar(String usuario, String clave) {
        if (usuario.toLowerCase().toString().equals("nelson") && clave.equals("123456")) {
            return "Bienvenido.";
        } else {
            return "error en usuario";
        }
    }
}