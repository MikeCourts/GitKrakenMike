package com.digitalhouse.retrofitbase.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.digitalhouse.retrofitbase.Controller.ControllerMovies;
import com.digitalhouse.retrofitbase.Controller.ControllerNews2;
import com.digitalhouse.retrofitbase.DAO.Movies.MovieDao;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Model.News2.News2;
import com.digitalhouse.retrofitbase.R;
import com.digitalhouse.retrofitbase.Utils.ResultListener;

import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textview);
        ListView listView = findViewById(R.id.listView);

        ControllerMovies controllerMovies = new ControllerMovies();
        controllerMovies.getMovies(new ResultListener<List<Movie>>() {
            @Override
            public void finish(List<Movie> resultado) {
                Toast.makeText(MainActivity.this, resultado.toString(), Toast.LENGTH_LONG).show();

//                TextView textView = findViewById(R.id.textview);
//                textView.setText(resultado.toString());




                String title = resultado.get(1).getTitle();
//                textView.setText(title);


                
                


//                Movie movie = (Movie) resultado;
//                String title = String.valueOf(resultado.get(Integer.parseInt(movie.getTitle())));
//                textView.setText(title);

            }
        }, this);



//        ControllerNews2 controllerNews2 = new ControllerNews2();
//        controllerNews2.getNews(new ResultListener<List<News2>>() {
//            @Override
//            public void finish(List<News2> resultado) {
//                Toast.makeText(MainActivity.this, resultado.toString(), Toast.LENGTH_LONG).show();
//            }
//        }, this);
    }
}
