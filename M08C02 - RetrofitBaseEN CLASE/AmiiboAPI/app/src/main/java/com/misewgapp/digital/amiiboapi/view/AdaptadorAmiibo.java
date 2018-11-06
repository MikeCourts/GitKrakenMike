package com.misewgapp.digital.amiiboapi.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.misewgapp.digital.amiiboapi.R;
import com.misewgapp.digital.amiiboapi.model.Amiibo;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorAmiibo extends RecyclerView.Adapter<AdaptadorAmiibo.AmiiboHolder> {
    private List<Amiibo> amiiboList = new ArrayList<>();

    // Constructor
    public AdaptadorAmiibo(List<Amiibo> amiiboList) {
        this.amiiboList = amiiboList;
    }

    // Setter
    public void setAmiiboList(List<Amiibo> amiiboList) {
        this.amiiboList = amiiboList;
        notifyDataSetChanged();
    }

    @Override
    public AmiiboHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);

        AmiiboHolder amiiboHolder = new AmiiboHolder(view);

        return amiiboHolder;
    }

    @Override
    public void onBindViewHolder(AmiiboHolder amiiboHolder, int i) {

        Amiibo amiibo = amiiboList.get(i);

        amiiboHolder.cargar(amiibo);

    }

    @Override
    public int getItemCount() {
        return amiiboList.size();
    }
    // ViewHolder
    public class AmiiboHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewImagen;
        private TextView textViewNombre;
        private TextView textViewSeries;

        public AmiiboHolder(View itemView) {
            super(itemView);

            imageViewImagen = itemView.findViewById(R.id.imageViewImagen);
            textViewNombre = itemView.findViewById(R.id.textView_nombre);
            textViewSeries = itemView.findViewById(R.id.textView_series);
        }
        // Cargo los datos
        public void cargar(Amiibo amiibo){

            textViewNombre.setText(amiibo.getName());
            textViewSeries.setText(amiibo.getAmiiboSeries());

            Glide.with(itemView.getContext())
                    .load(amiibo.getImage())
                    .into(imageViewImagen);

        }

    }



}
