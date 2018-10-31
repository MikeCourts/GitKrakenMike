package com.digitalhouse.viewpagertablayoutwithsetupwithviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<Tab> tabList;

    public ViewPagerAdapter(List<Tab> tabList, FragmentManager fm) {
        super(fm);
        this.tabList = tabList;

        // Por cada Dato le pido un Fragment a la factory y lo agrego a la lista de fragments
        for (Tab tab : tabList){

            ColorFragment colorFragment = ColorFragment.fabrica(tab.getColor());

            fragmentList.add(colorFragment);
        }
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    // Método que usa el TabLayout para pedir el titulo de las pages
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabList.get(position).getTitulo();
    }
}
