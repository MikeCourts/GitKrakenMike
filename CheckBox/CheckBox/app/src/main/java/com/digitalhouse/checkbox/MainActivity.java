package com.digitalhouse.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Busco los componentes
        Button button = findViewById(R.id.button);

        final CheckBox checkBox1 = findViewById(R.id.checkbox1);
        final CheckBox checkBox2 = findViewById(R.id.checkbox2);
        final CheckBox checkBox3 = findViewById(R.id.checkbox3);
        final CheckBox checkBox4 = findViewById(R.id.checkbox4);

        // Listener que sabe reaccionar ante checks de checkbox
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Estas Seguro?", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Cagon!!", Toast.LENGTH_SHORT).show();

                }
            }
        };

        // Me suscribo a los checks de los checkbox
        checkBox1.setOnCheckedChangeListener(listener);
        checkBox2.setOnCheckedChangeListener(listener);
        checkBox3.setOnCheckedChangeListener(listener);
        checkBox4.setOnCheckedChangeListener(listener);


        // Button OnClick

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = "";

                if (checkBox1.isChecked()){
                    texto = texto + checkBox1.getText().toString() + " - ";
                }

                if (checkBox2.isChecked()){
                    texto = texto + checkBox2.getText().toString() + " - ";
                }

                if (checkBox3.isChecked()){
                    texto = texto + checkBox3.getText().toString() + " - ";
                }

                if (checkBox4.isChecked()){
                    texto = texto + checkBox4.getText().toString() + " - ";
                }

                if (texto.isEmpty()){
                    Toast.makeText(MainActivity.this, "Debe seleccionar al menos 1 opción", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
