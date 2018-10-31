package com.example.o21582.libredeculpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Receta_detalle_activity extends AppCompatActivity {
    public static final Integer KEY_IMAGEN = 0;
    public static final String KEY_TITULO = "titulo";
    public static final String KEY_INGREDIENTES = "ingredientes";
    public static final String KEY_PREPARACION = "preparacion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta_detalle_activity);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Integer datoImagen = bundle.getInt(String.valueOf(KEY_IMAGEN));
        String datoTitulo = bundle.getString(KEY_TITULO);
        String datoIngredientes = bundle.getString(KEY_INGREDIENTES);
        String datoPreparacion = bundle.getString(KEY_PREPARACION);

        ImageView imagen = findViewById(R.id.IV_imagen);
        TextView titulo = findViewById(R.id.TV_titulo);
        TextView ingredientes = findViewById(R.id.TV_ingredientes);
        TextView preparacion = findViewById(R.id.TV_preparacion);

        imagen.setImageResource(datoImagen);
        titulo.setText(datoTitulo);
        ingredientes.setText(datoIngredientes);
        preparacion.setText(datoPreparacion);



    }
}
