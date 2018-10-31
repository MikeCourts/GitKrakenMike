package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.DAO;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.ClaseContenedora;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoArchivo {

    public List<Producto> obtenerProductosDeArchivo(Context context){

        List<Producto> productos = new ArrayList<>();

        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open("productList.jason");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();
            ClaseContenedora claseContenedora = gson.fromJson(bufferedReader, ClaseContenedora.class);
            productos = claseContenedora.getListaDeProductos();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return productos;
    }



}
