package com.misewgapp.digital.mikecourts.view;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.misewgapp.digital.mikecourts.R;
import com.misewgapp.digital.mikecourts.util.Util;

public class LoginActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mAuth = FirebaseAuth.getInstance();
        mAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

            }
        });



        // FACEBOOK/FIREBASE LOGIN
        callbackManager = CallbackManager.Factory.create();

        final LoginButton loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions("email", "public_profile");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Toast.makeText(LoginActivity.this, "Exito", Toast.LENGTH_SHORT).show();

                // FIREBASE LOGIN
                handleFacebookAccessToken(loginResult.getAccessToken());


            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });


    }

    private void handleFacebookAccessToken(AccessToken token) {

        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                        // ...
                    }
                });
    }





    public void updateUI(FirebaseUser user){

        if (user != null) {

            String name = user.getDisplayName();
            Uri uri = user.getPhotoUrl();

                Intent intent = new Intent(LoginActivity.this, RecyclerActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(RecyclerActivity.KEY_NAME, user.getDisplayName());
                bundle.putString(RecyclerActivity.KEY_URI, String.valueOf(user.getPhotoUrl()));
                intent.putExtras(bundle);
                startActivity(intent);



        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

}


//    Intent intent = new Intent(LoginActivity.this, RecyclerActivity.class);
//    Bundle bundle = new Bundle();
//            bundle.putString(RecyclerActivity.KEY_NAME, user.getDisplayName());
//                    bundle.putString(RecyclerActivity.KEY_URI, String.valueOf(user.getPhotoUrl()));
//                    intent.putExtras(bundle);
//                    startActivity(intent);
