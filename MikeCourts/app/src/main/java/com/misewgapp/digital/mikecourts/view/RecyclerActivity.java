package com.misewgapp.digital.mikecourts.view;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.misewgapp.digital.mikecourts.R;
import com.misewgapp.digital.mikecourts.controller.ControllerPaints;
import com.misewgapp.digital.mikecourts.model.Paints;
import com.misewgapp.digital.mikecourts.util.ResultListener;
import com.misewgapp.digital.mikecourts.view.adapters.AdapterPaintings;
import com.misewgapp.digital.mikecourts.view.adapters.AdapterPaints;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import pl.aprilapps.easyphotopicker.EasyImage;

public class RecyclerActivity extends AppCompatActivity implements AdapterPaints.AdapterPaintsInterface {
    public static final String KEY_NAME = "facebookUserName";
    public static final String KEY_URI = "uri";
//    private TextView nameTextView;
//    private ImageView photoImageView;
//    private Button logoutButton;
    private android.support.v7.widget.Toolbar toolbar;
//    private AdapterPaints adapterPaints;
    private AdapterPaints adapterPaints;

    private FirebaseAuth firebaseAuth;
    private FirebaseStorage myStorage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        myStorage = FirebaseStorage.getInstance();

        // ADAPTER INSTANCE
        adapterPaints = new AdapterPaints(new ArrayList<Paints>(), this);



        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Paintings");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));




        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null){
            String name = user.getDisplayName();
            Uri photo = user.getPhotoUrl();
            String uid = user.getUid();


//            nameTextView.setText(name);
//            Glide.with(this).load(photo).into(photoImageView);
        } else {
            goLoginScreen();
        }




        // DATA
        final ControllerPaints controllerPaints = new ControllerPaints();
        controllerPaints.bringPaints(this, new ResultListener<List<Paints>>() {
            @Override
            public void finish(List<Paints> result) {
                adapterPaints.setPaintsList(result);

            }
        });



        // RECYCLERVIEW
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapterPaints);
        adapterPaints.notifyDataSetChanged();








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

            case R.id.profilePic:
                EasyImage.openChooserWithGallery(RecyclerActivity.this, "Open in..", 101);
                break;
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


    @Override
    public void goToDetail(Paints paints) {
        Intent intent = new Intent(RecyclerActivity.this, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(DetailActivity.KEY_NAME, paints.getName());
        bundle.putString(DetailActivity.KEY_ARTISTID, paints.getArtistID());
        bundle.putString(DetailActivity.KEY_IMAGE, paints.getImage());
        intent.putExtras(bundle);
        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        EasyImage.handleActivityResult(requestCode, resultCode, data, RecyclerActivity.this, new EasyImage.Callbacks() {
            @Override
            public void onImagePickerError(Exception e, EasyImage.ImageSource imageSource, int i) {

            }

            @Override
            public void onImagesPicked(@NonNull List<File> list, EasyImage.ImageSource imageSource, int i) {
                if (list.size()>0) {
                    switch (i) {

                        case 101:
                        File file = list.get(0);
                        // URI
                        Uri uri = Uri.fromFile(file);
                        imageView = findViewById(R.id.imageView_newFoto);
                        Glide.with(RecyclerActivity.this).load(uri).into(imageView);
                        // TEMP URI
                        Uri uriTemp = Uri.fromFile(new File(uri.getPath()));
                        String fotoName = uriTemp.getLastPathSegment();

                        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                        String userId = user.getUid();



                        StorageReference root = myStorage.getReference();
                        StorageReference newPhoto = root.child("fotos/users/" + userId + "/" + fotoName);

                        UploadTask uploadTask = newPhoto.putFile(uriTemp);

                        uploadTask.addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(RecyclerActivity.this, "Failure", Toast.LENGTH_SHORT).show();
                            }
                        });

                        uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                Toast.makeText(RecyclerActivity.this, "Success", Toast.LENGTH_SHORT).show();
                            }
                        });


                        break;

                    }
                }
            }

            @Override
            public void onCanceled(EasyImage.ImageSource imageSource, int i) {

            }
        });



    }
}
