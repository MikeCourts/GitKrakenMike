package com.digitalhouse.recyclerview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TomasAdapter extends RecyclerView.Adapter {
    // ATRIBUTO
    private List<Auto> melvinData;

    // Constructor
    public TomasAdapter(List<Auto> melvinData) {
        this.melvinData = melvinData;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context contexto =  parent.getContext();

        LayoutInflater alvaroInflador = LayoutInflater.from(contexto);

        View view = alvaroInflador.inflate(R.layout.item_layout, parent, false);

        // NECESITO CREAR UN VIEWHOLDER
        MikeViewHolder mikeViewHolder = new MikeViewHolder(view);

        return mikeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Busco el dato
        Auto auto = melvinData.get(position);

        // Casteo
        MikeViewHolder mikeViewHolder = (MikeViewHolder) holder;
        mikeViewHolder.cargar(auto);
    }

    @Override
    public int getItemCount() {
        return melvinData.size();
    }


    public class MikeViewHolder extends RecyclerView.ViewHolder{
        // Atributos
        private TextView modelo;


        // Constructor
        public MikeViewHolder(View itemView) {
            super(itemView);
            // Lo mande a mike al fondo
            modelo = itemView.findViewById(R.id.textView);
        }

        // Metodo -  bindear DATA
        public void cargar(Auto auto){
            modelo.setText(auto.getModelo());
        }
    }
}
