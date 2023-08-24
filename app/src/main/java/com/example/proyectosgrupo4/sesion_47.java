package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class sesion_47 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_47);

        Configuration newConfig=this.getResources().getConfiguration();
        LinearLayout pantalla=findViewById(R.id.pantalla);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            pantalla.setOrientation(LinearLayout.HORIZONTAL);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            pantalla.setOrientation(LinearLayout.VERTICAL);
        }
    }
}