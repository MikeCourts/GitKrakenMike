package com.example.o21582.twitterlogintest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.twitter.sdk.android.core.models.User;

public class LoginActivity extends AppCompatActivity {

    TwitterLoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Twitter.initialize(this);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.login_button);
        loginButton.setCallback(new Callback<TwitterSession>() {
            @Override
            public void success(Result<TwitterSession> result) {
                // Do something with result, which provides a TwitterSession for making API calls
                final TwitterSession session = TwitterCore.getInstance().getSessionManager().getActiveSession();
                final TwitterAuthToken authToken = session.getAuthToken();

                //TRYING FOR TWITTER INFO

                TwitterApiClient apiClient = new TwitterApiClient(session);
                apiClient.getAccountService().verifyCredentials(true, false, true).enqueue(new Callback<User>() {
                    @Override
                    public void success(Result<User> result) {


//                        String token = authToken.token;
//                        String secret = authToken.secret;

                        login(session, result);


                    }

                    @Override
                    public void failure(TwitterException exception) {

                    }
                });


//                String token = authToken.token;
//                String secret = authToken.secret;
//
//                login(session);

            }

            @Override
            public void failure(TwitterException exception) {
                // Do something on failure
                Toast.makeText(LoginActivity.this, "Authentication Failed", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void login(TwitterSession session, Result<User> userResult) {
        String username = session.getUserName();
        User user = userResult.data;
        String profilePic = user.profileImageUrl;

        Intent intent = new Intent(LoginActivity.this, Homepage.class);

        intent.putExtra("username", username);
        intent.putExtra("urlImageProfile", profilePic);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result to the login button.
        loginButton.onActivityResult(requestCode, resultCode, data);
    }

}
