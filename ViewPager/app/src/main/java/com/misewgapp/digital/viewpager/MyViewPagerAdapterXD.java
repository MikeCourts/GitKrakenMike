package com.misewgapp.digital.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyViewPagerAdapterXD extends FragmentPagerAdapter {
    private List<Fragment> datos;

    public MyViewPagerAdapterXD(FragmentManager fm, List<Fragment> datos) {
        super(fm);
        this.datos = datos;
    }

    @Override
    public Fragment getItem(int position) {
        return datos.get(position);
    }

    @Override
    public int getCount() {
        return datos.size();
    }
}
