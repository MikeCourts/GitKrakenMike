package com.misewgapp.digital.recyclerviewpersonajes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HeroAdapter.AdapterInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StarWarsHero> heroes = new ArrayList<>();

        heroes.add(new StarWarsHero("Anakin", StarWarsHero.Categoria.JEDI, R.drawable.anakin));
        heroes.add(new StarWarsHero("Chewbacca", StarWarsHero.Categoria.ANIMAL, R.drawable.cheeeeeewbacca));
        heroes.add(new StarWarsHero("Darth Vader", StarWarsHero.Categoria.SITH, R.drawable.darthvvvvader));
        heroes.add(new StarWarsHero("Darth Maul", StarWarsHero.Categoria.SITH, R.drawable.darthmaul));
        heroes.add(new StarWarsHero("Darth Sidious", StarWarsHero.Categoria.SITH, R.drawable.darthsidious));
        heroes.add(new StarWarsHero("Mace Windu", StarWarsHero.Categoria.JEDI, R.drawable.macewindu));
        heroes.add(new StarWarsHero("Obi Wan Kenobi", StarWarsHero.Categoria.JEDI, R.drawable.obiwan));
        heroes.add(new StarWarsHero("Princess Leia", StarWarsHero.Categoria.ANIMAL, R.drawable.princessleia));
        heroes.add(new StarWarsHero("Qui-Gon", StarWarsHero.Categoria.JEDI, R.drawable.quigon));
        heroes.add(new StarWarsHero("R2D2", StarWarsHero.Categoria.DROID, R.drawable.r2d2));
        heroes.add(new StarWarsHero("Yoda", StarWarsHero.Categoria.JEDI, R.drawable.yoda));
        heroes.add(new StarWarsHero("Jar Jar Binks", StarWarsHero.Categoria.ANIMAL, R.drawable.jarjar));
        heroes.add(new StarWarsHero("Jabba The Hutt", StarWarsHero.Categoria.ANIMAL, R.drawable.jabba));
        heroes.add(new StarWarsHero("Rey", StarWarsHero.Categoria.JEDI, R.drawable.reystar));
        heroes.add(new StarWarsHero("Luke Skywalker", StarWarsHero.Categoria.JEDI, R.drawable.luke));
        heroes.add(new StarWarsHero("C-3po", StarWarsHero.Categoria.DROID, R.drawable.cpo));
        heroes.add(new StarWarsHero("Han Solo", StarWarsHero.Categoria.ANIMAL, R.drawable.hanso));

        RecyclerView recyclerView = findViewById(R.id.RV_starwars_personajes);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Adapter
        HeroAdapter heroAdapter = new HeroAdapter(this, heroes);
        recyclerView.setAdapter(heroAdapter);














    }

    @Override
    public void irDetalle(StarWarsHero hero) {
        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt(DetalleActivity.KEY_IMAGEN, hero.getImagen());
        bundle.putString(DetalleActivity.KEY_NOMBRE, hero.getNombre());
        bundle.putString(DetalleActivity.KEY_CATEGORIA, hero.getCategoria().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
