package com.example.o21582.twitterlogintest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Homepage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        String username = getIntent().getStringExtra("username");
        String profilePic = getIntent().getStringExtra("urlImageProfile");



        TextView uname = findViewById(R.id.TV_username);
        uname.setText(username);

        ImageView profpic = findViewById(R.id.profilePic);
        Glide.with(this).load(profilePic).into(profpic);

    }
}
