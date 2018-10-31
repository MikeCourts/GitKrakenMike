package com.example.o21582.libredeculpa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecetaAdapter extends RecyclerView.Adapter {
    private List<Receta> recetas;
    private AdapterInterface escuchador;

    public RecetaAdapter(List<Receta> recetas, AdapterInterface escuchador) {
        this.recetas = recetas;
        this.escuchador = escuchador;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.receta_layout, parent, false);

        RecetaHolder recetaHolder = new RecetaHolder(view);

        return recetaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Receta receta = recetas.get(position);

        RecetaHolder recetaHolder = (RecetaHolder) holder;
        recetaHolder.cargar(receta);
    }

    @Override
    public int getItemCount() {
        return recetas.size();
    }

    public interface AdapterInterface {
        void irReceta(Receta receta);
    }

    public class RecetaHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView titulo;

        public RecetaHolder(View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.imageView_imagen);
            titulo = itemView.findViewById(R.id.textView_titulo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Receta receta = recetas.get(getAdapterPosition());
                    escuchador.irReceta(receta);
                }
            });

        }

        public void cargar(Receta receta){
            imagen.setImageResource(receta.getImagen());
            titulo.setText(receta.getTitulo());
        }

    }

}
