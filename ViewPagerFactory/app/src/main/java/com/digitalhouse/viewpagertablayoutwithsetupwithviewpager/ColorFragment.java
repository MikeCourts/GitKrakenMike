package com.digitalhouse.viewpagertablayoutwithsetupwithviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {
    // Creo todas las claves necesarias para armar el Bundle en el Factory
    private static final String KEY_COLOR = "color";

    // Metodo Factory, me crea e inicializa una instancia de Color Fragment
    public static ColorFragment fabrica(Integer color){
        ColorFragment colorFragment = new ColorFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_COLOR, color);
        colorFragment.setArguments(bundle);
        return colorFragment;
    }

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Desarmo el Bundle
        Bundle bundle = getArguments();
        Integer color = bundle.getInt(KEY_COLOR);

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_color, container, false);

        // Busco el componente
        FrameLayout frameLayout = view.findViewById(R.id.background);
        // Seteo el componente
        frameLayout.setBackgroundColor(color);


        return view;
    }

}
