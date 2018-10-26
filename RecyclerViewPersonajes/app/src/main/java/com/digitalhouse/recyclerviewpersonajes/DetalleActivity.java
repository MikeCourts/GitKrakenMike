package com.digitalhouse.recyclerviewpersonajes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    public static final String KEY_IMAGEN = "imagen";
    public static final String KEY_NOMBRE = "nombre";
    public static final String KEY_CATEGORIA = "categoria";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // COMUNICACION ENTRE ACTIVITIES
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        // DATOS
        Integer datoImagen = bundle.getInt(KEY_IMAGEN);
        String datoNombre = bundle.getString(KEY_NOMBRE);
        String datoCategoria = bundle.getString(KEY_CATEGORIA);

        // COMPONENTES
        ImageView imagen = findViewById(R.id.imageViewImagenDetalle);
        TextView nombre = findViewById(R.id.textViewNombreDetalle);
        TextView categoria = findViewById(R.id.textViewCategoriaDetalle);


        // SETEO
        nombre.setText(datoNombre);
        categoria.setText(datoCategoria);
        imagen.setImageResource(datoImagen);



    }
}
