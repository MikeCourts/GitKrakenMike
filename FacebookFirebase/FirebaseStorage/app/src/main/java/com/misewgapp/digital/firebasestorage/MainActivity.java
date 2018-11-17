package com.misewgapp.digital.firebasestorage;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.List;

import pl.aprilapps.easyphotopicker.EasyImage;

public class MainActivity extends AppCompatActivity {
    private FirebaseStorage mStorage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LUGAR DONDE CARGAR LA IMAGEN
        imageView = findViewById(R.id.imageViewImagen);

        // GERENTE
        mStorage = FirebaseStorage.getInstance();

        // RAIZ DEL STORAGE
        StorageReference raiz = mStorage.getReference();

        StorageReference imagenReference = raiz.child("deadpool2.jpg");
        StorageReference marvelReference = raiz.child("Marvel").child("deadpool.jpg");



        marvelReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Glide.with(MainActivity.this).load(uri).into(imageView);
            }
        });

        // Download directly from StorageReference using Glide
        // (See MyAppGlideModule for Loader registration)
//        Glide.with(this /* context */)
//                .load(imagenReference)
//                .into(imageView);

        FloatingActionButton fabCamera = findViewById(R.id.fabCamera);
        fabCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyImage.openChooserWithGallery(MainActivity.this, "Abrir en..", 101);
            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        EasyImage.handleActivityResult(requestCode, resultCode, data, MainActivity.this, new EasyImage.Callbacks() {
            @Override
            public void onImagePickerError(Exception e, EasyImage.ImageSource imageSource, int i) {

            }

            @Override
            public void onImagesPicked(@NonNull List<File> list, EasyImage.ImageSource imageSource, int i) {
                if (list.size()>0) {
                    switch (i) {
                        case 101:
                            // OBTENGO EL PRIMER ARCHIVO
                            File file = list.get(0);
                            // OBTENGO LA URI
                            Uri uri = Uri.fromFile(file);
                            Glide.with(MainActivity.this).load(uri).into(imageView);

                            // URI DEL ARCHIVO COPIA
                            Uri uriTemporal = Uri.fromFile(new File(uri.getPath()));
                            // PARA CAMBIARLE EL NOMBRE AL FILE
//                            String extension = uriTemporal.getLastPathSegment().substring(uriTemporal.getLastPathSegment().indexOf("."));

                            // RAIZ REFERENCIA
                            StorageReference raiz = mStorage.getReference();
                            StorageReference nuevaFoto = raiz.child("fotosCamara").child(uriTemporal.getLastPathSegment());

                            UploadTask uploadTask = nuevaFoto.putFile(uriTemporal);

                            uploadTask.addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(MainActivity.this, "Fallo", Toast.LENGTH_SHORT).show();
                                }
                            });

                            uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                    Toast.makeText(MainActivity.this, "Exito", Toast.LENGTH_SHORT).show();
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
