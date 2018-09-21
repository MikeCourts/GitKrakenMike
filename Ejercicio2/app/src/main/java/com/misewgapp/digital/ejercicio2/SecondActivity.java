package com.misewgapp.digital.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String NOMBRE = "nombre";
    public static final String APELLIDO = "apellido";
    public static final String EDAD = "edad";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewNombre = findViewById(R.id.TextViewNombreRecibido);
        TextView textViewApellido = findViewById(R.id.TextViewApellidoRecibido);
        TextView textViewEdad = findViewById(R.id.TextViewEdadRecibido);

        Intent intent = getIntent();

        try {
            Bundle bundle = intent.getExtras();
            String nombre = bundle.getString(NOMBRE);
            String apellido = bundle.getString(APELLIDO);
            String edad = bundle.getString(EDAD);
            textViewNombre.setText(nombre);
            textViewApellido.setText(apellido);
            textViewEdad.setText(edad);

        } catch (NullPointerException e){
            e.printStackTrace();
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            // MATO LA ACTIVIDAD
            finish();

        }


    }
}
