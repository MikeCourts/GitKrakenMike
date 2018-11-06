package com.misewgapp.digital.amiiboapi.dao;



import android.util.Log;

import com.misewgapp.digital.amiiboapi.model.Amiibo;

import com.misewgapp.digital.amiiboapi.model.ContenedorAmiibo;
import com.misewgapp.digital.amiiboapi.util.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaoInternetAmiibo extends DaoHelper {
    private static final String BASE_URL ="http://www.amiiboapi.com/";
    private ServiceAmiibo serviceAmiibo;

    public DaoInternetAmiibo() {
        super(BASE_URL);
        serviceAmiibo = retrofit.create(ServiceAmiibo.class);
    }

    public void traerAmiibos(final ResultListener<List<Amiibo>> listenerController){

        retrofit2.Call<ContenedorAmiibo> call = serviceAmiibo.traerAmiibo();
        call.enqueue(new Callback<ContenedorAmiibo>() {
            @Override
            public void onResponse(retrofit2.Call<ContenedorAmiibo> call, Response<ContenedorAmiibo> response) {

                ContenedorAmiibo contenedorAmiibo = response.body();

                List<Amiibo> amiibos = contenedorAmiibo.getAmiibo();

                listenerController.finish(amiibos);

            }

            @Override
            public void onFailure(retrofit2.Call<ContenedorAmiibo> call, Throwable t) {
                Log.e("MIERRROR", t.toString());
            }
        });

    }

    public void traerAmiibosPorNombre(String nombre, final ResultListener<List<Amiibo>> listenerController){

        Call<ContenedorAmiibo> call = serviceAmiibo.traerAmiibosPorNombre(nombre);
        call.enqueue(new Callback<ContenedorAmiibo>() {
            @Override
            public void onResponse(Call<ContenedorAmiibo> call, Response<ContenedorAmiibo> response) {
                ContenedorAmiibo contenedorAmiibo = response.body();

                List<Amiibo> amiiboList = contenedorAmiibo.getAmiibo();

                if (amiiboList != null){
                    listenerController.finish(amiiboList);
                }
                
            }

            @Override
            public void onFailure(Call<ContenedorAmiibo> call, Throwable t) {
                Log.e("MIERRROR", t.toString());
            }
        });

    }


}
