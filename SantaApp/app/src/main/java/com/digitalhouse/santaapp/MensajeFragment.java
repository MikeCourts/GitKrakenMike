package com.digitalhouse.santaapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MensajeFragment extends Fragment {
    public static final String KEY_MENSAJE = "mensaje";

    public MensajeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Bundle bundle = getArguments();
        String mensaje = bundle.getString(KEY_MENSAJE);


        View view =  inflater.inflate(R.layout.fragment_mensaje, container, false);

        TextView textViewMensaje = view.findViewById(R.id.textViewMensaje);
        textViewMensaje.setText(mensaje);


        return view;
    }

}
