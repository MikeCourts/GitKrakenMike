package com.example.o21582.santafragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SantaFragment extends Fragment {


    public SantaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_santa, container, false);

       final EditText editTextMensaje = view.findViewById(R.id.editTextMensaje);
       Button enviar = view.findViewById(R.id.buttonEnviar);

       enviar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String mensaje = editTextMensaje.getText().toString();

               //Necesito a alguien que me sepa escuchar para alertarlo
               MensajeInterface alguien = (MensajeInterface) getContext();
               alguien.viaTrineoSanta(mensaje);
           }
       });

       return  view;
    }

    public interface MensajeInterface{
        public void viaTrineoSanta(String mensaje);
    }

}
