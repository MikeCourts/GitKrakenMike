package com.misewgapp.digital.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonMandarMain);
        final EditText editTextNombre = findViewById(R.id.EditTextNombre);
        final EditText editTextApellido = findViewById(R.id.EditTextApellido);
        final EditText editTextEdad = findViewById(R.id.EditTextEdad);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IR A LA OTRA ACTIVITY
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                //CREAR LA ENCOMIENDA
                Bundle bundleNombre = new Bundle();
                Bundle bundleApellido = new Bundle();
                Bundle bundleEdad = new Bundle();

                bundleNombre.putString(SecondActivity.NOMBRE, String.valueOf(editTextNombre.getText()));
                bundleApellido.putString(SecondActivity.APELLIDO, String.valueOf(editTextApellido.getText()));
                bundleEdad.putInt(SecondActivity.EDAD, Integer.valueOf(editTextEdad.getText().toString()));

                intent.putExtras(bundleNombre);
                intent.putExtras(bundleApellido);
                intent.putExtras(bundleEdad);
                startActivity(intent);



            }
        });


    }
}
