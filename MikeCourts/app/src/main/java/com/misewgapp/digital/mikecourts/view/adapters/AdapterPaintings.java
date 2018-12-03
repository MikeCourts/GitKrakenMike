package com.misewgapp.digital.mikecourts.view.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.misewgapp.digital.mikecourts.R;
import com.misewgapp.digital.mikecourts.model.Paints;

import java.util.List;

public class AdapterPaintings extends RecyclerView.Adapter {

    private List<Paints> paintsList;

    public AdapterPaintings(List<Paints> paintsList) {
        this.paintsList = paintsList;
    }

    public void setPaintsList(List<Paints> paintsList) {
        this.paintsList = paintsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);

        PaintsHolder paintsHolder = new PaintsHolder(view);

        return paintsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Paints paints = paintsList.get(position);
        PaintsHolder paintsHolder = (PaintsHolder) holder;
        paintsHolder.loadData(paints);
    }

    @Override
    public int getItemCount() {
        return paintsList.size();
    }



    public class PaintsHolder extends RecyclerView.ViewHolder {
        private TextView textViewArtistName;
        private TextView textViewPaintName;
        final ImageView paintingImage;

        public PaintsHolder(View itemView) {
            super(itemView);
            textViewArtistName = itemView.findViewById(R.id.textView_artistName);
            paintingImage = itemView.findViewById(R.id.imageView_painting);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Paints paints = paintsList.get(getAdapterPosition());
//                    myListener.goToDetail(paints);
//                }
//            });


        }

        // Load data

        public void loadData(Paints paints){

            textViewPaintName.setText(paints.getName());


        }

    }

}
