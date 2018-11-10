package com.misewgapp.digital.redessocialesfacebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private TextView textViewNombre;
    private ImageView imageViewProfPic;
    private ImageView imageView;


    private AccessTokenTracker accessTokenTracker = new AccessTokenTracker() {
        @Override
        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
            if (oldAccessToken != null && currentAccessToken == null){
                textViewNombre.setText("");
                imageViewProfPic.setImageDrawable(null);
            }
        }
    };


    @Override
    protected void onStart() {
        super.onStart();

        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();

        if (isLoggedIn) {
            cargarDatos();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        callbackManager = CallbackManager.Factory.create();
        textViewNombre = findViewById(R.id.textViewNombre);
        imageViewProfPic = findViewById(R.id.facebook_photo);
        imageView = findViewById(R.id.imageView_collapsingToolbar);



        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        // If using in a fragment
//        loginButton.setFragment(this);

        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Toast.makeText(LoginActivity.this, "Exito", Toast.LENGTH_SHORT).show();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cargarDatos();
                    }
                }, 1000);

            }

            @Override
            public void onCancel() {
                // App
                Toast.makeText(LoginActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void cargarDatos() {
        Profile profile = Profile.getCurrentProfile();
        if (profile != null) {


            textViewNombre.setText(profile.getName());
            Uri uri = profile.getProfilePictureUri(500, 500);

            Glide.with(this).load(uri).into(imageViewProfPic);


        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

}
