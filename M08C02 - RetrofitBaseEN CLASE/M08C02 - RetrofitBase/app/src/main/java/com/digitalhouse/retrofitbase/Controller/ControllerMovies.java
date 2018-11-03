package com.digitalhouse.retrofitbase.Controller;

import android.content.Context;
import android.net.ConnectivityManager;

import com.digitalhouse.retrofitbase.DAO.Movies.MovieDao;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Utils.ResultListener;
import com.digitalhouse.retrofitbase.Utils.Util;

import java.util.List;

public class ControllerMovies {

    public void getMovies(final ResultListener<List<Movie>> listenerView, Context context){

        if (Util.hayInternet(context)){
            MovieDao movieDao = new MovieDao();
            movieDao.getMovies(new ResultListener<List<Movie>>() {
                @Override
                public void finish(List<Movie> resultado) {
                    // BAJAR A LA BASE DE DATOS

                    listenerView.finish(resultado);

                }
            });

        } else {
            // SUBIR DE LA BASE DE DATOS

        }



    }

}
