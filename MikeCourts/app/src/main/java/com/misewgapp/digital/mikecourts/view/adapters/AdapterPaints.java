package com.misewgapp.digital.mikecourts.view.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.gson.JsonObject;
import com.misewgapp.digital.mikecourts.R;
import com.misewgapp.digital.mikecourts.model.Paints;

import java.util.ArrayList;
import java.util.List;

public class AdapterPaints extends RecyclerView.Adapter<AdapterPaints.PaintsHolder> {
    private List<Paints> paintsList = new ArrayList<>();
    private AdapterPaintsInterface myListener;



    public AdapterPaints(List<Paints> paintsList, AdapterPaintsInterface myListener) {
        this.paintsList = paintsList;
        this.myListener = myListener;
    }



    public void setPaintsList(List<Paints> paintsList) {
        this.paintsList = paintsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PaintsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);

        PaintsHolder paintsHolder = new PaintsHolder(view);

        return paintsHolder;
    }


    public void onBindViewHolder(@NonNull PaintsHolder paintsHolder, int position) {

        Paints paints = paintsList.get(position);

        paintsHolder.loadData(paints);
    }


    public interface AdapterPaintsInterface {
        void goToDetail(Paints paints);
    }

    @Override
    public int getItemCount() {
        return paintsList.size();
    }

    public class PaintsHolder extends RecyclerView.ViewHolder {
        private TextView textViewArtistName;
        private TextView textViewPaintName;
        private ImageView paintingImage;

        public PaintsHolder(View itemView) {
            super(itemView);
            textViewArtistName = itemView.findViewById(R.id.textView_artistName);
            paintingImage = itemView.findViewById(R.id.imageView_painting);





            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Paints paints = paintsList.get(getAdapterPosition());
                    myListener.goToDetail(paints);
                }
            });


            }

        // Load data

        public void loadData(Paints paints){

//            textViewPaintName.setText(paints.getName());
            textViewArtistName.setText(paints.getName());

            String imageName = paints.getImage();





            FirebaseStorage myStorage = FirebaseStorage.getInstance();

            StorageReference imageReference = myStorage.getReference().child(imageName);

            imageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Glide.with(itemView).load(uri).into(paintingImage);
                }
            });

        }

    }


}
