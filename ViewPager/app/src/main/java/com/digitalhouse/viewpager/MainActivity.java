package com.digitalhouse.viewpager;

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

        // ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Adapter
        MyViewPagerAdapterXD adapter = new MyViewPagerAdapterXD(fragmentList, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

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
