package com.misewgapp.digital.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Datos
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new RedFragment());
        fragmentList.add(new GreenFragment());
        fragmentList.add(new BlueFragment());

        // ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Adapter
        MyViewPagerAdapterXD adapter = new MyViewPagerAdapterXD(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        // Inicializo
        viewPager.setCurrentItem(1);
//        viewPager.setPageMargin(40);
//        viewPager.setClipToPadding(false);
        viewPager.setPadding(5,5,5,5);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
