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

public class sesion_40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_40);

        Button btnEfecto=findViewById(R.id.btnEfecto);
        btnEfecto.setOnClickListener(this::animar);
    }

     public void animar(View view){
         ImageView ivRosaDeLosVientos=findViewById(R.id.ivRosaDeLosVientos);

         AnimationSet animacion=new AnimationSet(true);
         animacion.addAnimation(new RotateAnimation(0,180, Animation.RELATIVE_TO_SELF,0.5f, Animation.RELATIVE_TO_SELF,0.5f));
         animacion.setDuration(5000);
         animacion.setInterpolator( new LinearInterpolator());

         ivRosaDeLosVientos.startAnimation(animacion);

     }
}