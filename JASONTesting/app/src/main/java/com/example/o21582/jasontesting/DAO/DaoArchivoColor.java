package com.example.o21582.jasontesting.DAO;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.o21582.jasontesting.Model.Color;
import com.example.o21582.jasontesting.Model.ContenedorColor;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DaoArchivoColor {

    public List<Color> getColores(Context context){
        List<Color> colores = new ArrayList<>();

        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open("colores.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();

            ContenedorColor contenedorColor = gson.fromJson(bufferedReader, ContenedorColor.class);

            colores = contenedorColor.getColores();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return colores;
    }


}
