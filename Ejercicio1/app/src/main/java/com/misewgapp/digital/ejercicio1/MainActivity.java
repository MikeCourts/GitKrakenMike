package com.misewgapp.digital.ejercicio1;

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

        Button button = findViewById(R.id.buttonMain);
        final EditText editText = findViewById(R.id.editTextMain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IR A LA OTRA ACTIVITY
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);

                //CREAR LA ENCOMIENDA
                Bundle bundle = new Bundle();
                bundle.putString(Second_Activity.MENSAJE, String.valueOf(editText.getText()));

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}
