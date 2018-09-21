package com.example.o21582.loginregisterej2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button = findViewById(R.id.buttonLoginRegister);
        final EditText editTextPassword1 = findViewById(R.id.editTextPasswordRegister);
        final EditText editTextPassword2 = findViewById(R.id.editTextPasswordConfirmRegister);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                String pwd1 = editTextPassword1.toString();
                String pwd2 = editTextPassword2.toString();

                Toast.makeText(RegisterActivity.this, pwd1.toString(), Toast.LENGTH_LONG).show();

                if (pwd1.equals(pwd2)){
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Toast.makeText(RegisterActivity.this, "Passwords do not match", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}
