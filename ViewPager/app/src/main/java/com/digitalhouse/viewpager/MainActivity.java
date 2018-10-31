package com.digitalhouse.viewpager;

<<<<<<< HEAD
=======
import android.content.Intent;
import android.support.design.widget.TabLayout;
>>>>>>> master
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bienvenidos ACA ESTUVO ALVARO
        // CREAR UNA LINEA DE BOLITAS AZULES (HACER BOOM)

        // Datos
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new RedFragment());
        fragmentList.add(new GreenFragment());
        fragmentList.add(new BlueFragment());

<<<<<<< HEAD
        // ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Adapter
        MyViewPagerAdapterXD adapter = new MyViewPagerAdapterXD(fragmentList, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

=======
        // Titulos
        List<String> titulos = new ArrayList<>();
        titulos.add("Rojo");
        titulos.add("Verde");
        titulos.add("Azul");

        // ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);
        // TabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        // esto es como se crea en codigo un TAB
//        tabLayout.addTab(tabLayout.newTab());

        tabLayout.setupWithViewPager(viewPager);



        // Adapter
        MyViewPagerAdapterXD adapter = new MyViewPagerAdapterXD(getSupportFragmentManager(), fragmentList, titulos);
        viewPager.setAdapter(adapter);

        for (Integer i=0; i < tabLayout.getTabCount();i++){
            tabLayout.getTabAt(i).setIcon(R.drawable.ic_android_black_24dp);
        }

>>>>>>> master
        // Inicializo
        viewPager.setCurrentItem(1);
        viewPager.setClipToPadding(false);
//        viewPager.setPageMargin(50);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(MainActivity.this, Integer.toString(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
