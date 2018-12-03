package com.misewgapp.digital.mikecourts.view;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.misewgapp.digital.mikecourts.R;
import com.misewgapp.digital.mikecourts.model.Artists;
import com.misewgapp.digital.mikecourts.model.Paints;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_NAME = "name";
    public static final String KEY_ARTISTID = null;
    public static final String KEY_IMAGE = "image";
    private FirebaseStorage myStorage;
    private FirebaseDatabase myDatabase;
    private DatabaseReference artistReference;
    private TextView textViewArtistName;
    private ImageView imageView;
    private TextView textViewPaintingName;
    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        artistReference = FirebaseDatabase.getInstance().getReference();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String image = bundle.getString(KEY_IMAGE);
        String paintingName = bundle.getString(KEY_NAME);
        final String artistID = bundle.getString(KEY_ARTISTID);

        textViewPaintingName = findViewById(R.id.textView_PaintingName_detail);
        textViewArtistName = findViewById(R.id.textView_artistName_detail);
        imageView = findViewById(R.id.imageView_detail);

        final TextView textViewArtistNationality = findViewById(R.id.textView_artistNationality_detail);
        final TextView textViewArtistInfluence = findViewById(R.id.textView_artistInfluencedBy_detail);

        myStorage = FirebaseStorage.getInstance();
        StorageReference imageReference = myStorage.getReference().child(image);

        imageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Glide.with(DetailActivity.this).load(uri).into(imageView);
            }
        });


        textViewPaintingName.setText(paintingName);



        DatabaseReference artistIdReference = artistReference.child("artists");
        artistIdReference.orderByChild("artistId").equalTo(artistID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()) {
                    String name = data.child("name").getValue().toString();
                    String nationality = data.child("nationality").getValue().toString();
                    String influenced_by = data.child("Influenced_by").getValue().toString();
                    textViewArtistName.setText(name);
                    textViewArtistNationality.setText(nationality);
                    textViewArtistInfluence.setText(influenced_by);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}
