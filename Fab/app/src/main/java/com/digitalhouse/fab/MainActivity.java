package com.digitalhouse.fab;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // EL SNACKBAR NECESITA UNA VIEW, UN TEXTO Y SU DURACIÓN.
                // TAMBIEN TE PERMITE MOSTRAR UNA ACTION CLICKEABLE

                // A DIFERENCIA DEL TOAST EL SNACKAR DE EN VEZ DE UN CONTEXT PIDE UNA VIEW
                // DICHA VIEW DEBE ESTAR CONTENIDA EN UN COORDINATOR O EN ALGUNA VIEW QUE ESTE CONTENIDA EN UN COORDINATOR.
                final Snackbar snackbar = Snackbar.make(v, "SOY FAB", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Cierro el snackbar
                        snackbar.dismiss();
                    }
                });
                String appname = getResources().getString(R.string.app_name);
                int color = ContextCompat.getColor(MainActivity.this, R.color.colorAccent);

                snackbar.setActionTextColor(color);

                snackbar.show();
            }
        });
    }
}
