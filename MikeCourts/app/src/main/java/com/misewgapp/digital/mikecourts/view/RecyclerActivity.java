package com.misewgapp.digital.mikecourts.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.misewgapp.digital.mikecourts.R;

public class RecyclerActivity extends AppCompatActivity {
    public static final String KEY_NAME = "facebookUserName";
    public static final String KEY_URI = "uri";
    private TextView textView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String name = bundle.getString(KEY_NAME);
        Uri uri = Uri.parse(bundle.getString(KEY_URI));

        textView.setText(name);
        Glide.with(this).load(uri).into(imageView);




    }
}
