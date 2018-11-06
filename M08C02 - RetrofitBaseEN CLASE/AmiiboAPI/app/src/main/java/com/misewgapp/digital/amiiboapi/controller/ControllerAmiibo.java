package com.misewgapp.digital.amiiboapi.controller;

import android.content.Context;

import com.misewgapp.digital.amiiboapi.dao.DaoInternetAmiibo;
import com.misewgapp.digital.amiiboapi.model.Amiibo;
import com.misewgapp.digital.amiiboapi.util.ResultListener;
import com.misewgapp.digital.amiiboapi.util.Util;

import java.util.List;

public class ControllerAmiibo {

    public void traerAmiibos(Context context, final ResultListener<List<Amiibo>> listenerView){
        if (Util.isOnline(context)){
            DaoInternetAmiibo daoInternetAmiibo = new DaoInternetAmiibo();
            daoInternetAmiibo.traerAmiibos(new ResultListener<List<Amiibo>>() {
                @Override
                public void finish(List<Amiibo> Resultado) {
                    listenerView.finish(Resultado);
                }
            });
        } else {
            // BASE DE DATOS
        }
    }

    public void traerAmiibosPorNombre(String nombre, Context context, final ResultListener<List<Amiibo>> listenerView){
        if (Util.isOnline(context)){
            DaoInternetAmiibo daoInternetAmiibo = new DaoInternetAmiibo();
            daoInternetAmiibo.traerAmiibosPorNombre(nombre, new ResultListener<List<Amiibo>>() {
                @Override
                public void finish(List<Amiibo> Resultado) {
                    listenerView.finish(Resultado);
                }
            });
        } else {
            // BASE DE DATOS
        }
    }

}
