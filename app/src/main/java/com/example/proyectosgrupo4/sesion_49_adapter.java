package com.example.proyectosgrupo4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class sesion_49_adapter extends RecyclerView.Adapter<sesion_49_adapter.ViewHolder> {
    private List<String> ListaElementos;
    private LayoutInflater layoutInflater;
    private Context context;

    public sesion_49_adapter(List<String> listaElementos, Context context) {
        this.ListaElementos = listaElementos;
        //
        this.layoutInflater=LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item_Recycler=layoutInflater.inflate(R.layout.sesion_49_plantilla,null);
        return new sesion_49_adapter.ViewHolder(item_Recycler);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.BindData(ListaElementos.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaElementos.size();
    }

    //public class ViewHolder extends
    public class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox Elemento;

        public ViewHolder(View plantilla) {
            super(plantilla);
            Elemento=plantilla.findViewById(R.id.Elemento);
        }

        public void  BindData(String producto){
            Elemento.setText(producto);
        }
    }

}
