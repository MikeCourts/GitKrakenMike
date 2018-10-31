package com.example.o21582.jasontesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.o21582.jasontesting.Model.Color;
import com.example.o21582.jasontesting.controller.ControllerColor;

import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ControllerColor controllerColor = new ControllerColor();
        List<Color> colores = controllerColor.getColor(this);



        Toast.makeText(this, colores.toString(), Toast.LENGTH_LONG).show();

        TextView textViewNombre = findViewById(R.id.nombre);
        TextView textViewCodigo = findViewById(R.id.codigo);







    }
}
