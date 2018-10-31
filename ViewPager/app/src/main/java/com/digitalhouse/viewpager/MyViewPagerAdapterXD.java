package com.digitalhouse.viewpager;

<<<<<<< HEAD
=======
import android.support.annotation.Nullable;
>>>>>>> master
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyViewPagerAdapterXD extends FragmentPagerAdapter {
    private List<Fragment> datos;
<<<<<<< HEAD

    public MyViewPagerAdapterXD(List<Fragment> datos, FragmentManager fm) {
        super(fm);
        this.datos = datos;
=======
    private List<String> titulos;

    public MyViewPagerAdapterXD(FragmentManager fm, List<Fragment> datos, List<String> titulos) {
        super(fm);
        this.datos = datos;
        this.titulos = titulos;
>>>>>>> master
    }

    @Override
    public Fragment getItem(int position) {
        return datos.get(position);
    }

    @Override
    public int getCount() {
        return datos.size();
    }
<<<<<<< HEAD
=======


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
>>>>>>> master
}
