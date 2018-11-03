package com.digitalhouse.retrofitbase.DAO.News2;

import com.digitalhouse.retrofitbase.DAO.DaoHelper;
import com.digitalhouse.retrofitbase.Model.News2.ContainerNews2;
import com.digitalhouse.retrofitbase.Model.News2.News2;
import com.digitalhouse.retrofitbase.Utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class News2Dao extends DaoHelper {
    private ServiceNews2 serviceNews2;

    public News2Dao() {
        super("https://newsapi.org/v2/");

        serviceNews2 = retrofit.create(ServiceNews2.class);
    }


    public void dameNews2(final ResultListener<List<News2>> listenerController){

        serviceNews2.getNewsFromApi("us", "business", "934593fa588640158b951fac6bddd238").enqueue(new Callback<ContainerNews2>() {
            @Override
            public void onResponse(Call<ContainerNews2> call, Response<ContainerNews2> response) {
                ContainerNews2 containerNews2 = response.body();


                if (response.body()!= null) {
                    listenerController.finish(containerNews2.getResults());
                }
            }

            @Override
            public void onFailure(Call<ContainerNews2> call, Throwable t) {

            }
        });



    }


}
