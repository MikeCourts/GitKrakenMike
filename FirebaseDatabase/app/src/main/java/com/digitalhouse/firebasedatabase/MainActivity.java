package com.digitalhouse.firebasedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.digitalhouse.firebasedatabase.pojo.Tweet;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance();
        mReference  = mDatabase.getReference();


        mReference.child("timeLine").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot childSnapShot : dataSnapshot.getChildren()){

                    Tweet tweet = childSnapShot.getValue(Tweet.class);

                    Toast.makeText(MainActivity.this, tweet.getNombre().toString() + tweet.getLastTweet(), Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



//        mReference.child("timeLine").addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                Tweet tweet = dataSnapshot.getValue(Tweet.class);
//                Toast.makeText(MainActivity.this, "onChildAdded", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, tweet.toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//                Tweet tweet = dataSnapshot.getValue(Tweet.class);
//                Toast.makeText(MainActivity.this, "onChildChanged", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, tweet.toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//                Tweet tweet = dataSnapshot.getValue(Tweet.class);
//                Toast.makeText(MainActivity.this,"onChildRemoved", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, tweet.toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//                Tweet tweet = dataSnapshot.getValue(Tweet.class);
//                Toast.makeText(MainActivity.this, "onChildMoved", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, tweet.toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Toast.makeText(MainActivity.this, "Canceled", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        DatabaseReference id = mReference.child("timeLine").push();
//        id.setValue(new Tweet(id.getKey(), "Yo", "Por Mi", "Jaja"));

    }
}
