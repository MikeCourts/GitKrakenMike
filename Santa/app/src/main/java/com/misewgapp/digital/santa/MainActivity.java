package com.misewgapp.digital.santa;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentSanta fragmentSanta = new FragmentSanta();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentSanta, fragmentSanta);
        fragmentTransaction.commit();

    }

    public void irSegundaActivity(String mensaje){
        //Hago el cambio de activity
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(FragmentMensaje.KEY_MENSAJE, mensaje);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
