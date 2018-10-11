package com.misewgapp.digital.recyclerviewpersonajes;

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

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        // Datos
        Integer datoImagen = bundle.getInt(KEY_IMAGEN);
        String datoNombre = bundle.getString(KEY_NOMBRE);
        String datoCategoria = bundle.getString(KEY_CATEGORIA);

        // Componentes
        ImageView imagen = findViewById(R.id.IM_image_detalle);
        TextView nombre = findViewById(R.id.TV_nombre_detalle);
        TextView categoria = findViewById(R.id.TV_categoria_detalle);

        // Seteo
        nombre.setText(datoNombre);
        categoria.setText(datoCategoria);
        imagen.setImageResource(datoImagen);

    }
}
