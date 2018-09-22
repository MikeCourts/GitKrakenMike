package com.misewgapp.digital.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManagerNonConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRojo = findViewById(R.id.buttonRojo);
        Button buttonVerde = findViewById(R.id.buttonVerde);

        final FragmentRojo fragmentRojo = new FragmentRojo();
        final FragmentVerde fragmentVerde = new FragmentVerde();


        buttonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentRojo fragmentRojo = new FragmentRojo();

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragmentWhole, fragmentRojo);

                fragmentTransaction.commit();

            }
        });

        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                FragmentVerde fragmentVerde = new FragmentVerde();

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragmentWhole, fragmentVerde);

                fragmentTransaction.commit();

            }
        });

    }
}
