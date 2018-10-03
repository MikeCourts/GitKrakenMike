package com.example.o21582.facebooktestinglogin1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private static final String EMAIL = "email";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        LoginButton loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions("email", "public_profile");



        callbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                String userId = loginResult.getAccessToken().getUserId();

                GraphRequest graphRequest = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        displayUserInfo(object);
                    }
                });

                Bundle parameters = new Bundle();
                parameters.putString("fields", "first_name, last_name, email, id");
                graphRequest.setParameters(parameters);
                graphRequest.executeAsync();


            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });
        AccessToken accessToken = AccessToken.getCurrentAccessToken();

        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
        if (isLoggedIn) {
            GraphRequest graphRequest = GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
                @Override
                public void onCompleted(JSONObject object, GraphResponse response) {
                    displayUserInfo(object);
                }
            });

            Bundle parameters = new Bundle();
            parameters.putString("fields", "first_name, last_name, email, id");
            graphRequest.setParameters(parameters);
            graphRequest.executeAsync();
        }
    }

    @SuppressLint("SetTextI18n")
    public void displayUserInfo(JSONObject object) {

        String first_name = "";
        String last_name = "";
        String email = "";
        String id = "";


        first_name = getString(object, "first_name");
        last_name = getString(object, "last_name");
        email = getString(object, "email");
        id = getString(object, "id");

        ProfilePictureView profpic = findViewById(R.id.friendProfilePicture);
        TextView tv_name = findViewById(R.id.TV_name);
        TextView tv_email = findViewById(R.id.TV_email);
        TextView tv_id = findViewById(R.id.TV_id);


        tv_name.setText(first_name + " " + last_name);
//        tv_email.setText(email);
//        tv_id.setText(id);
        profpic.setProfileId(id);

    }

    private String getString(JSONObject object, String key) {
        try {
            return object.getString(key);
        } catch (JSONException e) {
            return "";
        }
    }


}
