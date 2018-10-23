package digitalhouse.com.mundialapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

import digitalhouse.com.mundialapp.data.DataProvider;
import digitalhouse.com.mundialapp.data.Jugador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TODO 2 Instanciar Data provider y pedir la lista de datos
        DataProvider dataProvider = new DataProvider();


//        TODO 3 Buscar ViewPager del layout
        final ViewPager viewPager = findViewById(R.id.viewPager);

//        TODO 9 Crear Adaptador del ViewPager pasandole la lista de datos y el fragment manager

//        TODO 10 Setear Adaptador al ViewPager
    }
}
