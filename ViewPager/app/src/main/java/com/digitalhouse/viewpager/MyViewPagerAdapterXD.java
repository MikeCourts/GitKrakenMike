package com.digitalhouse.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyViewPagerAdapterXD extends FragmentPagerAdapter {
    private List<Fragment> datos;
    private List<String> titulos;

    public MyViewPagerAdapterXD(FragmentManager fm, List<Fragment> datos, List<String> titulos) {
        super(fm);
        this.datos = datos;
        this.titulos = titulos;
    }

    @Override
    public Fragment getItem(int position) {
        return datos.get(position);
    }

    @Override
    public int getCount() {
        return datos.size();
    }


    // Metodo que usa el TabLayout para pedir el titulo de las pages
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return titulos.get(position);

//        switch (position){
//            case 0:
//                return "Rojo";
//            case 1:
//                return "Verde";
//            case 2:
//                return "Azul";
//
//        }
//        return "Nada";
    }
}
