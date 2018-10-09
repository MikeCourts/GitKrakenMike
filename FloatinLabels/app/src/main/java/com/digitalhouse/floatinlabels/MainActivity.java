package com.digitalhouse.floatinlabels;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout inputUser = findViewById(R.id.inputUser);
        final TextInputLayout inputPassword = findViewById(R.id.inputPassword);
        final EditText editTextUser = findViewById(R.id.editTextUser);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUser.getText().toString();
                String password = editTextPassword.getText().toString();

                if (password.length() < 10){
                    // PROBLEMA AMIGO

                    String textoError = getResources().getString(R.string.error_password);
                    inputPassword.setError(textoError);
                } else {
                    // OK TODES
                    inputPassword.setError(null);
                    Toast.makeText(MainActivity.this, "Wiiiiii", Toast.LENGTH_LONG).show();
                }




            }
        });

    }
}
