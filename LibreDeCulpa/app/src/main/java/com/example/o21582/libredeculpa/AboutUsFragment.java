package com.example.o21582.libredeculpa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {


    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        TextView textView = view.findViewById(R.id.textview_about_us);
        textView.setText("Los productos Libre de Culpa siguen provocando placer, inspiración y dando alas a la creatividad de quienes los eligen día a día.  \n" +
                "\n" +
                "Libre de Culpa no sólo es la vanguardia del sabor local, también lo es a la hora de elegir la calidad de los productos exclusivos que importa de todo el mundo.\n" +
                "\n" +
                "Aliado incondicional de la innovación en la cocina, Libre de Culpa está detrás del toque secreto para quienes desean sorprender a sus agasajados.\n" +
                "\n" +
                "Con el mismo desafío de siempre: ¡Atreverse a ser Gourmet!");


        return view;
    }

}
