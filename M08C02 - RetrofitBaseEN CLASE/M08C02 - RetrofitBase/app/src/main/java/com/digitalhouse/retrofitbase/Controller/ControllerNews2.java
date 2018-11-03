package com.digitalhouse.retrofitbase.Controller;

import android.content.Context;
import android.net.ConnectivityManager;

import com.digitalhouse.retrofitbase.DAO.Movies.MovieDao;
import com.digitalhouse.retrofitbase.DAO.News2.News2Dao;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Model.News.News;
import com.digitalhouse.retrofitbase.Model.News2.News2;
import com.digitalhouse.retrofitbase.Utils.ResultListener;
import com.digitalhouse.retrofitbase.Utils.Util;

import java.util.List;

public class ControllerNews2 {
    public void getNews(final ResultListener<List<News2>> listenerView, Context context){

        if (Util.hayInternet(context)){
            News2Dao news2Dao = new News2Dao();
            news2Dao.dameNews2(new ResultListener<List<News2>>() {
                @Override
                public void finish(List<News2> resultado) {
                    // BAJAR A LA BASE DE DATOS

                    listenerView.finish(resultado);

                }
            });

        } else {
            // SUBIR DE LA BASE DE DATOS

        }
    }
}
