package com.example.o21582.loginregisterej2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final String USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textViewUsername = findViewById(R.id.textViewUsernameLoginActivity);

        Intent intentUsername = getIntent();

        try {
            Bundle bundle = intentUsername.getExtras();
            String username = bundle.getString(USERNAME);
            String loginWelcome = "¡Welcome " + username + "!";
            textViewUsername.setText(loginWelcome);
        } catch (NullPointerException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            // MATO LA ACTIVIDAD
            finish();


        }
    }
}
