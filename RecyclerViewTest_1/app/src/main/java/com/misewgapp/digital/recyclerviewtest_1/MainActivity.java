package com.misewgapp.digital.recyclerviewtest_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DATOS
        List<Auto> datosMelvin = new ArrayList<>();
        datosMelvin.add(new Auto("Mercedes", "A1", "ROJO"));
        datosMelvin.add(new Auto("Renault", "Fuego", "Naranja"));
        datosMelvin.add(new Auto("Ford", "Falcon", "Beich"));
        datosMelvin.add(new Auto("Citroen", "13B", "Amarillo"));

        datosMelvin.add(new Auto("Mercedes", "A1", "ROJO"));
        datosMelvin.add(new Auto("Renault", "Fuego", "Naranja"));
        datosMelvin.add(new Auto("Ford", "Falcon", "Beich"));
        datosMelvin.add(new Auto("Citroen", "13B", "Amarillo"));

        datosMelvin.add(new Auto("Mercedes", "A1", "ROJO"));
        datosMelvin.add(new Auto("Renault", "Fuego", "Naranja"));
        datosMelvin.add(new Auto("Ford", "Falcon", "Beich"));
        datosMelvin.add(new Auto("Citroen", "13B", "Amarillo"));

        datosMelvin.add(new Auto("Mercedes", "A1", "ROJO"));
        datosMelvin.add(new Auto("Renault", "Fuego", "Naranja"));
        datosMelvin.add(new Auto("Ford", "Falcon", "Beich"));
        datosMelvin.add(new Auto("Citroen", "13B", "Amarillo"));

        // LISTA
        RecyclerView recyclerViewCamilo = findViewById(R.id.recyclerView);

        // MEJORA EL DESEMPEÑO SI EL TAMAÑO DEL RECYCLER NO CAMBIA DURANTE LA EJECUCION
        recyclerViewCamilo.setHasFixedSize(true);

        // COMO SE MUESTRA
        RecyclerView.LayoutManager ignacioLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewCamilo.setLayoutManager(ignacioLayoutManager);

        // ADAPTER
        AdapterTomas adapterTomas = new AdapterTomas(datosMelvin);
        recyclerViewCamilo.setAdapter(adapterTomas);

    }
}
