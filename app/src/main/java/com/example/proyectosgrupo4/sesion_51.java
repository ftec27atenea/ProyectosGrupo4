package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class sesion_51 extends AppCompatActivity {

    ArrayList<String> ListaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_51);
        LlenarLista();
    }

    public void LlenarLista(){

        ListaProductos= new ArrayList<>();

        ListaProductos.add("Pan");
        ListaProductos.add("Leche");
        ListaProductos.add("Huevos");
        ListaProductos.add("Arroz");
        ListaProductos.add("Azucar");
        ListaProductos.add("Aceite");
        ListaProductos.add("Chocolate");
        ListaProductos.add("Café");
        ListaProductos.add("Harina");
        ListaProductos.add("Te");
        ListaProductos.add("Pasta");
        ListaProductos.add("Salsa de tomate");
        ListaProductos.add("Fríjol");
        ListaProductos.add("Mayonesa");
        ListaProductos.add("Gelatina");
        ListaProductos.add("Mermelada");
        ListaProductos.add("Cereal");

        sesion_51_adapter adapter=new sesion_51_adapter(ListaProductos,this);
        RecyclerView rv_ListaProductos=findViewById(R.id.rv_ListaProductos);
        rv_ListaProductos.setHasFixedSize(true);
        rv_ListaProductos.setLayoutManager(new LinearLayoutManager(this));
        rv_ListaProductos.setAdapter(adapter);
    }
}