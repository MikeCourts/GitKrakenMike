package com.misewgapp.digital.recyclerviewtest_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterTomas extends RecyclerView.Adapter {
    // ATRIBUTO
    private List<Auto> datosMelvin;

    //CONSTRUCTOR
    public AdapterTomas(List<Auto> datosMelvin) {
        this.datosMelvin = datosMelvin;
    }

    //GETTER
    public List<Auto> getDatosMelvin() {
        return datosMelvin;
    }

    //METODOS
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context contexto = parent.getContext();

        LayoutInflater alvaroInflador = LayoutInflater.from(contexto);

        View view = alvaroInflador.inflate(R.layout.item_layout, parent, false);

        //NECESITO CREAR UN VIEWHOLDER
        MikeViewHolder mikeViewHolder = new MikeViewHolder(view);

        return mikeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // BUSCO EL DATO
        Auto auto = datosMelvin.get(position);

        // CASTEO
        MikeViewHolder mikeViewHolder = (MikeViewHolder) holder;
        mikeViewHolder.cargar(auto);
    }

    @Override
    public int getItemCount() {
        return datosMelvin.size();
    }

    public class MikeViewHolder extends RecyclerView.ViewHolder{
        //ATRIBUTOS
        private TextView modelo;

        //CONSTRUCTOR
        public MikeViewHolder(View itemView) {
            super(itemView);
            // Lo mando a Mike al fondo
            modelo = itemView.findViewById(R.id.textView);
        }

        // METODO - bindea DATA
        public void cargar(Auto auto){
            modelo.setText(auto.getModelo());
        }
    }

}
