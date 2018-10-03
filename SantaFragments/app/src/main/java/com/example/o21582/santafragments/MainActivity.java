package com.example.o21582.santafragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SantaFragment santaFragment = new SantaFragment();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerSantaFragment, santaFragment);
        fragmentTransaction.commit();

    }

    public void viaTrineoSanta(String mensaje){
        //FALTA CODIGO

        Toast.makeText(this, "Mensaje Enviado: " + mensaje, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MensajeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(MensajeFragment.KEY_MENSAJE, mensaje);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
