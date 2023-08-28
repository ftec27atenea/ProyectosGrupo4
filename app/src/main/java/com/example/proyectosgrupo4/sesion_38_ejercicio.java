package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sesion_38_ejercicio extends AppCompatActivity {

    private ImageView iv1;
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion38_ejercicio);

        iv1 = (ImageView)findViewById(R.id.imageView3);
        boton1 = (Button)findViewById(R.id.HideButton);
    }

    public void Hide(View view){
        boton1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }
}