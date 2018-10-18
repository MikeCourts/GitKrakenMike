package com.misewgapp.digital.drawerlayout;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Fragment birthdayFragment = new BirthdayFragment();
        final Fragment spaFragment = new SpaFragment();
        final Fragment dinnerFragment = new DinnerFragment();


        drawerLayout = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.navigation);


        //Usar la imagen circular del header
//        View header = navigationView.getHeaderView(0);
//        header.findViewById(R.id.circular_image_view);



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                drawerLayout.closeDrawers();

                switch (item.getItemId()){

                    case R.id.birthday:
                        cargarFragment(birthdayFragment);
                        return true;

                    case R.id.spa:
                        cargarFragment(spaFragment);
                        return true;

                    case R.id.dinner:
                        cargarFragment(dinnerFragment);
                        return true;

                }

                return false;
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)){
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }

    public void cargarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

}
