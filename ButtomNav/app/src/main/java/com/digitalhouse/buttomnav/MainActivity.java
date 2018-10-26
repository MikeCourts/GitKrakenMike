package com.digitalhouse.buttomnav;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        textViewMessage.setText(R.string.title_home);
                        return true;
                    case R.id.navigation_dashboard:
                        textViewMessage.setText(R.string.title_dashboard);
                        return true;
                    case R.id.navigation_notifications:
                        textViewMessage.setText(R.string.title_notifications);
                        return true;
                }
                return false;
            }
        });
    }
}
