package com.misewgapp.digital.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {
    public static final String MENSAJE = "mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        Intent intent = getIntent();

        try {
            Bundle bundle = intent.getExtras();
            String valor = bundle.getString(MENSAJE);
            TextView textView = findViewById(R.id.textViewSecond);
            textView.setText(valor);

        } catch (NullPointerException e){
            e.printStackTrace();
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            // MATO LA ACTIVIDAD
            finish();

        }

    }
}
