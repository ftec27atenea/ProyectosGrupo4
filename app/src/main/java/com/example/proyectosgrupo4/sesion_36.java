package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sesion_36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_36);
    }

    public void MostrarDatoEnMensaje(View view){
        EditText TextViewData = findViewById(R.id.TextViewData);
        Toast.makeText(getApplicationContext(),TextViewData.getText(),Toast.LENGTH_LONG).show();
    }
}