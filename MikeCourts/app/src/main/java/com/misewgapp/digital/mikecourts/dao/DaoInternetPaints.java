package com.misewgapp.digital.mikecourts.dao;

import android.util.Log;

import com.misewgapp.digital.mikecourts.model.ContainerPaints;
import com.misewgapp.digital.mikecourts.model.Paints;
import com.misewgapp.digital.mikecourts.util.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DaoInternetPaints extends DaoHelper {
    public static final String BASE_URL ="https://api.myjson.com/";
    private ServicePaints servicePaints;

    public DaoInternetPaints() {
        super(BASE_URL);
        servicePaints = retrofit.create(ServicePaints.class);
    }

    public void bringPaints(final ResultListener<List<Paints>> listResultListener){

        retrofit2.Call<ContainerPaints> call = servicePaints.bringPaints();
        call.enqueue(new Callback<ContainerPaints>() {
            @Override
            public void onResponse(Call<ContainerPaints> call, Response<ContainerPaints> response) {

                ContainerPaints containerPaints = response.body();

                List<Paints> paints = containerPaints.getPaints();

                listResultListener.finish(paints);


            }

            @Override
            public void onFailure(Call<ContainerPaints> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });


//        Call<ContainerPaints> call = servicePaints.bringPaints();

//        call.enqueue(new Callback<ContainerPaints>() {
//            @Override
//            public void onResponse(Call<ContainerPaints> call, Response<ContainerPaints> response) {
//
//                ContainerPaints containerPaints = response.body();
//
//                List<Paints> paints = containerPaints.getPaints();
//
//                listResultListener.finish(paints);
//
//            }
//
//            @Override
//            public void onFailure(Call<ContainerPaints> call, Throwable t) {
//                Log.e("Error", t.toString());
//            }
//        });



    }
}
