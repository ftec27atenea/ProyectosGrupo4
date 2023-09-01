package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class sesion_49 extends AppCompatActivity {

    List<String> ListaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_49);
        LlenarLista();
    }

    public void LlenarLista(){

        ListaProductos= new ArrayList<>();

        ListaProductos.add("Pan");
        ListaProductos.add("Crema para café");
        ListaProductos.add("Pure de tomate");
        ListaProductos.add("Alimento para bebe");
        ListaProductos.add("Alimento para mascotas");
        ListaProductos.add("Atole");
        ListaProductos.add("Avena");
        ListaProductos.add("Azúcar");
        ListaProductos.add("Café");
        ListaProductos.add("Cereales");
        ListaProductos.add("Chile piquín");
        ListaProductos.add("Especias");
        ListaProductos.add("Flan en polvo");
        ListaProductos.add("Formulas infantiles");
        ListaProductos.add("Gelatinas en polvo/Grenetina");
        ListaProductos.add("Harina");
        ListaProductos.add("Harina preparada");
        ListaProductos.add("Mole");
        ListaProductos.add("Sal");
        ListaProductos.add("Salsas envasadas");
        ListaProductos.add("Sazonadores");
        ListaProductos.add("Sopas en sobre");
        ListaProductos.add("Cajeta");
        ListaProductos.add("Catsup");
        ListaProductos.add("Mayonesa");
        ListaProductos.add("Mermelada");
        ListaProductos.add("Miel");
        ListaProductos.add("Te");
        ListaProductos.add("Vinagre");
        ListaProductos.add("Huevo");
        ListaProductos.add("Pastas");

        sesion_49_adapter adapter=new sesion_49_adapter(ListaProductos,this);
        RecyclerView rv_ListaProductos=findViewById(R.id.rv_ListaProductos);
        rv_ListaProductos.setHasFixedSize(true);
        rv_ListaProductos.setLayoutManager(new LinearLayoutManager(this));
        rv_ListaProductos.setAdapter(adapter);
    }


}