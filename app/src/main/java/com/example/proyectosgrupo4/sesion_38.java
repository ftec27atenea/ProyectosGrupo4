package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class sesion_38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_38);
        ImageView ivGif=findViewById(R.id.ivGif);
        Glide.with(this).load(R.drawable.giphy).into(ivGif);
    }
}