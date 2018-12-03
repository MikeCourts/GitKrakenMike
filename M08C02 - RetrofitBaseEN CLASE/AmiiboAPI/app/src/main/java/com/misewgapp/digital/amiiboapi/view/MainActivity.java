package com.misewgapp.digital.amiiboapi.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.misewgapp.digital.amiiboapi.R;
import com.misewgapp.digital.amiiboapi.controller.ControllerAmiibo;
import com.misewgapp.digital.amiiboapi.model.Amiibo;
import com.misewgapp.digital.amiiboapi.util.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private AdaptadorAmiibo adaptadorAmiibo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancio Adaptador antes que lo demas
        adaptadorAmiibo = new AdaptadorAmiibo(new ArrayList<Amiibo>());

        // Datos
        final ControllerAmiibo controllerAmiibo = new ControllerAmiibo();
        controllerAmiibo.traerAmiibos(this, new ResultListener<List<Amiibo>>() {
            @Override
            public void finish(List<Amiibo> Resultado) {
                adaptadorAmiibo.setAmiiboList(Resultado);
            }
        });

        // RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Performante
        recyclerView.setHasFixedSize(true);

        // Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Seteo el Adapter
        recyclerView.setAdapter(adaptadorAmiibo);


        //------------------------------------------------//

        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.botonBuscar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buscar lo que esta en el edit text
                String texto = editText.getText().toString();

                // Voy a hacer pedido
                controllerAmiibo.traerAmiibosPorNombre(texto, MainActivity.this, new ResultListener<List<Amiibo>>() {
                    @Override
                    public void finish(List<Amiibo> Resultado) {
                        adaptadorAmiibo.setAmiiboList(Resultado);
                    }
                });

            }
        });


    }


}