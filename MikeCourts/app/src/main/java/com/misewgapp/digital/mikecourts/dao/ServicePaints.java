package com.misewgapp.digital.mikecourts.dao;

import com.misewgapp.digital.mikecourts.model.ContainerPaints;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServicePaints {
    @GET("/bins/x858r")
    Call<ContainerPaints> bringPaints();

    @GET("/bins/x858r")
    Call<ContainerPaints> bringPaintsByName(@Query("name") String name);




}
