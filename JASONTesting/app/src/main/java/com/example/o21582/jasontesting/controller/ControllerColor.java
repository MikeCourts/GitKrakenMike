package com.example.o21582.jasontesting.controller;

import android.content.Context;

import com.example.o21582.jasontesting.DAO.DaoArchivoColor;
import com.example.o21582.jasontesting.Model.Color;

import java.util.List;

public class ControllerColor {

    public List<Color> getColor(Context context){

        List<Color> colores;



        DaoArchivoColor daoArchivoColor = new DaoArchivoColor();
        colores = daoArchivoColor.getColores(context);

        return colores;

    }
}
