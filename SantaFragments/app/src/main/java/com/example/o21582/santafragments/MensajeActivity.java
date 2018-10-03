package com.example.o21582.santafragments;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MensajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        MensajeFragment mensajeFragment = new MensajeFragment();
        mensajeFragment.setArguments(bundle);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerMensajeFragment, mensajeFragment);
        fragmentTransaction.commit();
    }
}
