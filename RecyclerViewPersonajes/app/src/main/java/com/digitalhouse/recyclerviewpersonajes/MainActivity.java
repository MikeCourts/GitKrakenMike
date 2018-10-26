package com.digitalhouse.recyclerviewpersonajes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements HeroAdapter.AdapterInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<StarWarsHero> heroes = new ArrayList<>();
        heroes.add(new StarWarsHero("Anakin", StarWarsHero.Categoria.JEDI, R.drawable.anakyn));
        heroes.add(new StarWarsHero("Rey", StarWarsHero.Categoria.JEDI, R.drawable.rey));
        heroes.add(new StarWarsHero("Yoda", StarWarsHero.Categoria.JEDI, R.drawable.master_yoda));
        heroes.add(new StarWarsHero("C3PO", StarWarsHero.Categoria.DROID, R.drawable.c3po));
        heroes.add(new StarWarsHero("R2D2", StarWarsHero.Categoria.DROID, R.drawable.r2d2));
        heroes.add(new StarWarsHero("Darth Maul", StarWarsHero.Categoria.SITH, R.drawable.darth_maul));
        heroes.add(new StarWarsHero("Darth Vader", StarWarsHero.Categoria.SITH, R.drawable.darth_vader));
        heroes.add(new StarWarsHero("Chewbacca", StarWarsHero.Categoria.ANIMAL, R.drawable.chewbacca));        heroes.add(new StarWarsHero("Anakin", StarWarsHero.Categoria.JEDI, R.drawable.anakyn));
        heroes.add(new StarWarsHero("Rey", StarWarsHero.Categoria.JEDI, R.drawable.rey));
        heroes.add(new StarWarsHero("Yoda", StarWarsHero.Categoria.JEDI, R.drawable.master_yoda));
        heroes.add(new StarWarsHero("C3PO", StarWarsHero.Categoria.DROID, R.drawable.c3po));
        heroes.add(new StarWarsHero("R2D2", StarWarsHero.Categoria.DROID, R.drawable.r2d2));
        heroes.add(new StarWarsHero("Darth Maul", StarWarsHero.Categoria.SITH, R.drawable.darth_maul));
        heroes.add(new StarWarsHero("Darth Vader", StarWarsHero.Categoria.SITH, R.drawable.darth_vader));
        heroes.add(new StarWarsHero("Chewbacca", StarWarsHero.Categoria.ANIMAL, R.drawable.chewbacca));        heroes.add(new StarWarsHero("Anakin", StarWarsHero.Categoria.JEDI, R.drawable.anakyn));
        heroes.add(new StarWarsHero("Rey", StarWarsHero.Categoria.JEDI, R.drawable.rey));
        heroes.add(new StarWarsHero("Yoda", StarWarsHero.Categoria.JEDI, R.drawable.master_yoda));
        heroes.add(new StarWarsHero("C3PO", StarWarsHero.Categoria.DROID, R.drawable.c3po));
        heroes.add(new StarWarsHero("R2D2", StarWarsHero.Categoria.DROID, R.drawable.r2d2));
        heroes.add(new StarWarsHero("Darth Maul", StarWarsHero.Categoria.SITH, R.drawable.darth_maul));
        heroes.add(new StarWarsHero("Darth Vader", StarWarsHero.Categoria.SITH, R.drawable.darth_vader));
        heroes.add(new StarWarsHero("Chewbacca", StarWarsHero.Categoria.ANIMAL, R.drawable.chewbacca));        heroes.add(new StarWarsHero("Anakin", StarWarsHero.Categoria.JEDI, R.drawable.anakyn));
        heroes.add(new StarWarsHero("Rey", StarWarsHero.Categoria.JEDI, R.drawable.rey));
        heroes.add(new StarWarsHero("Yoda", StarWarsHero.Categoria.JEDI, R.drawable.master_yoda));
        heroes.add(new StarWarsHero("C3PO", StarWarsHero.Categoria.DROID, R.drawable.c3po));
        heroes.add(new StarWarsHero("R2D2", StarWarsHero.Categoria.DROID, R.drawable.r2d2));
        heroes.add(new StarWarsHero("Darth Maul", StarWarsHero.Categoria.SITH, R.drawable.darth_maul));
        heroes.add(new StarWarsHero("Darth Vader", StarWarsHero.Categoria.SITH, R.drawable.darth_vader));
        heroes.add(new StarWarsHero("Chewbacca", StarWarsHero.Categoria.ANIMAL, R.drawable.chewbacca));

        // BUSCO EL RECYCLER VIEW
        RecyclerView recyclerView = findViewById(R.id.recyclerViewStarWarsPersonaje);

        // SI EL RECYCLER VIEW NO CAMBIA DE TAMAÑO LE METEMOS ESTA LINEA PARA QUE SEA MAS EFICIENTE
        recyclerView.setHasFixedSize(true);

        // CREAMOS Y SETEAMOS LAYOUT MANAGER
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // CREMOS Y SETEAMOS ADAPTER
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
