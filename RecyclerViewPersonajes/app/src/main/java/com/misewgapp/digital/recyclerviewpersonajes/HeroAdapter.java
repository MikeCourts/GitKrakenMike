package com.misewgapp.digital.recyclerviewpersonajes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter {

    // Atributo
    private List<StarWarsHero> heroes;
    private AdapterInterface escuchador;

    //Constructor
    public HeroAdapter(AdapterInterface escuchador, List<StarWarsHero> heroes) {
        this.heroes = heroes;
        this.escuchador = escuchador;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_layout, parent, false);

        HeroeHolder heroeHolder = new HeroeHolder(view);

        return heroeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Tengo que buscar el dato
        StarWarsHero hero = heroes.get(position);

        // Cargo dato en el holder
        HeroeHolder heroeHolder = (HeroeHolder) holder;
        heroeHolder.cargar(hero);

    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public interface AdapterInterface {
        void irDetalle(StarWarsHero hero);
    }

    public class HeroeHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private ImageView imagen;

        // Constructor
        public HeroeHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textViewPersonaje);
            imagen = itemView.findViewById(R.id.imageViewPersonaje);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StarWarsHero hero = heroes.get(getAdapterPosition());

                    escuchador.irDetalle(hero);
                }
            });
        }

        // Metodo
        public void cargar(StarWarsHero hero){
            nombre.setText(hero.getNombre());
            imagen.setImageResource(hero.getImagen());
        }
    }

}
