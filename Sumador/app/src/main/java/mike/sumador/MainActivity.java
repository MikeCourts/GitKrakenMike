package mike.sumador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener sumar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView contador = findViewById(R.id.zero);
                String numero = contador.getText().toString();
                Integer numeroValueOf = Integer.valueOf(numero);
                contador.setText(numeroValueOf + 1);
            }
        };

        Button button = findViewById(R.id.buttonSumar);
        button.setOnClickListener(sumar);
    }


}
