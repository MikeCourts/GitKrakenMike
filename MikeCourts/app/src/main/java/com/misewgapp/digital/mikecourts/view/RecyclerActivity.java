package com.misewgapp.digital.mikecourts.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.misewgapp.digital.mikecourts.R;

public class RecyclerActivity extends AppCompatActivity {
    public static final String KEY_NAME = "facebookUserName";
    public static final String KEY_URI = "uri";
    private TextView nameTextView;
    private ImageView photoImageView;
    private Button logoutButton;
    private android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        nameTextView = findViewById(R.id.textViewNombre);
        photoImageView = findViewById(R.id.imageViewFBPhoto);
        logoutButton = findViewById(R.id.logoutButton);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Paintings");


        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null){
            String name = user.getDisplayName();
            Uri photo = user.getPhotoUrl();
            String uid = user.getUid();

            nameTextView.setText(name);
            Glide.with(this).load(photo).into(photoImageView);
        } else {
            goLoginScreen();
        }



//        textView.setText(name);
//        Glide.with(this).load(uri).into(imageView);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.logoutMenu:
                logout();
        }


        return super.onOptionsItemSelected(item);
    }

    // FIREBASE & FACEBOOK METHODS
    private void goLoginScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void logout(){
        FirebaseAuth.getInstance().signOut();
        LoginManager.getInstance().logOut();
        goLoginScreen();
    }


}
