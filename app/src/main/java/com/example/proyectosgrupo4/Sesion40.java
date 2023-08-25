package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class Sesion40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion40);

        Button btn_efecto = findViewById(R.id.btn_efecto);
        btn_efecto.setOnClickListener(this::animar);
    }

    public void animar(View view) {
        AnimationSet estrellagirando = new AnimationSet(true);
        estrellagirando.addAnimation(new RotateAnimation(0,360));
        estrellagirando.setDuration(5000);
        estrellagirando.setInterpolator(new LinearInterpolator());

        ImageView estrella = findViewById(R.id.estrella);
        estrella.startAnimation(estrellagirando);
    }
}