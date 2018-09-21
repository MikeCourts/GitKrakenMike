package com.example.o21582.loginregisterej2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonRegister = findViewById(R.id.buttonRegister);
        final EditText editTextUsername = findViewById(R.id.editTextUsernameMain);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IR A LoginActivity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);

                //Crear la encomienda
                Bundle bundleUsername = new Bundle();

                bundleUsername.putString(LoginActivity.USERNAME, String.valueOf(editTextUsername.getText()));

                intent.putExtras(bundleUsername);
                startActivity(intent);

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ir a RegisterActivity
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                Bundle bundle = new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }
}
