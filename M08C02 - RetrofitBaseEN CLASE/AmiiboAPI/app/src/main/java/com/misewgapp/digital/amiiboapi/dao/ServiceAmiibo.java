package com.misewgapp.digital.amiiboapi.dao;

import com.misewgapp.digital.amiiboapi.model.ContenedorAmiibo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceAmiibo {
    @GET("api/amiibo")
    Call<ContenedorAmiibo> traerAmiibo();

    @GET("api/amiibo/")
    Call<ContenedorAmiibo> traerAmiibosPorNombre(@Query("name") String name);

}
