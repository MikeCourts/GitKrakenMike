package com.digitalhouse.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DATOS
        List<Auto> melvinData = new ArrayList<>();
        melvinData.add(new Auto("Mercedes", "A1", "Rojo"));
        melvinData.add(new Auto("Renault", "Fuego", "Naranja"));
        melvinData.add(new Auto("Ford", "Falcon", "Beich"));
        melvinData.add(new Auto("Citroen", "13B", "Amarillo"));

        melvinData.add(new Auto("Mercedes", "A1", "Rojo"));
        melvinData.add(new Auto("Renault", "Fuego", "Naranja"));
        melvinData.add(new Auto("Ford", "Falcon", "Beich"));
        melvinData.add(new Auto("Citroen", "13B", "Amarillo"));

        melvinData.add(new Auto("Mercedes", "A1", "Rojo"));
        melvinData.add(new Auto("Renault", "Fuego", "Naranja"));
        melvinData.add(new Auto("Ford", "Falcon", "Beich"));
        melvinData.add(new Auto("Citroen", "13B", "Amarillo"));

        melvinData.add(new Auto("Mercedes", "A1", "Rojo"));
        melvinData.add(new Auto("Renault", "Fuego", "Naranja"));
        melvinData.add(new Auto("Ford", "Falcon", "Beich"));
        melvinData.add(new Auto("Citroen", "13B", "Amarillo"));

        // LISTA
        RecyclerView camiloView = findViewById(R.id.recyclerView);

        // MEJORA EL DESEMPEÑO SI EL TAMAÑO DEL RECYCLER NO CAMBIA DURANTE LA EJECUCION
        camiloView.setHasFixedSize(true);

        // COMO SE MUESTRA
        RecyclerView.LayoutManager ignacioLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        camiloView.setLayoutManager(ignacioLayoutManager);

        // ADAPTER
        TomasAdapter tomasAdapter = new TomasAdapter(melvinData);
        camiloView.setAdapter(tomasAdapter);

    }
}
