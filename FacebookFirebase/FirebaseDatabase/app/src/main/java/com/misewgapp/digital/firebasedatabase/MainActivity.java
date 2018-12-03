package com.misewgapp.digital.firebasedatabase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;
    // "psfs"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase = FirebaseDatabase.getInstance();
        myRef = myDatabase.getReference();

        final TextView textView = findViewById(R.id.textTweet);

        myRef.child("timeLine").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot childSnapShot : dataSnapshot.getChildren()){

                    Tweet tweet = childSnapShot.getValue(Tweet.class);

                    Toast.makeText(MainActivity.this, tweet.getNombre().toString() + tweet.getLastTweet(), Toast.LENGTH_SHORT).show();
                    textView.setText(tweet.getLastTweet());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

//        DatabaseReference id = myRef.child("timeLine").push();
//
//        myRef.child("timeLine").child(id.getKey()).setValue(new Tweet(id.getKey(), "yo", "por mi", "jaja"));
//
//        myRef.child("timeLine").child("0").child("apodo").setValue("Jefe");
//
//        myRef.child("timeLine").child("3").child("nombre").setValue("Tomas");
//
//        myRef.child("timeLine").child("3").child("apellido").setValue(null);
//
//        myRef.child("timeLine").push().setValue("asd");




    }
}
