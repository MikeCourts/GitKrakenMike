package com.digitalhouse.viewpagertablayoutwithsetupwithviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------------- Datos ---------------------------------------//

        // DATOS
        List<Tab> tabList = new ArrayList<>();
        tabList.add(new Tab("Rojo", R.drawable.ic_android_black_24dp, ContextCompat.getColor(this, R.color.red)));
        tabList.add(new Tab("Verde", R.drawable.ic_android_black_24dp, ContextCompat.getColor(this, R.color.green)));
        tabList.add(new Tab("Azul", R.drawable.ic_android_black_24dp, ContextCompat.getColor(this, R.color.blue)));

        //-------------------------------- Buscar Componentes --------------------------------------//

        // ViewPager
        final ViewPager viewPager = findViewById(R.id.viewPager);


        // TabLayout
        final TabLayout tabLayout = findViewById(R.id.tabLayout);

        //-------------------------------- Creo las Tabs programaticamente --------------------------------------//
        // Genero las Tabs por código
        for (Tab tab : tabList){
            tabLayout.addTab(tabLayout.newTab());
        }

        //-------------------------------- Adaptador del ViewPager --------------------------------------//
        // Adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(tabList, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //-------------------------------- Configuracion inicial --------------------------------------//
        // Inicializo
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(1);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(50);
    }
}
