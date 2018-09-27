package com.digitalhouse.sumador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private Integer contador = 0;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);


        // BUSCO LOS COMPONENTES
        final TextView textView = view.findViewById(R.id.textView);

        Button sumador = view.findViewById(R.id.buttonSumar);
        Button restador = view.findViewById(R.id.buttonRestar);


        // CREO LOS LISTENERS
        View.OnClickListener listenerSumar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // OBTENGO EL TEXTO
                //String textoDelTextView = textView.getText().toString();
                // CONVERTIR A NUMERO
                //Integer numero = Integer.parseInt(textoDelTextView);
                // LE SUMO 1
                //numero = numero + 1;
                contador = contador + 1;

                textView.setText(contador.toString());
                //textView.setText(numero.toString());

            }
        };

        View.OnClickListener listenerRestar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                // OBTENGO EL TEXTO
//                String textoDelTextView = textView.getText().toString();
//                // CONVERTIR A NUMERO
//                Integer numero = Integer.parseInt(textoDelTextView);
//                // LE RESTAR 1
//                numero = numero - 1;

                contador = contador - 1;
                textView.setText(contador.toString());
//                textView.setText(numero.toString());
            }
        };


        // SUSCRIBIENDO LOS LISTENERS
        sumador.setOnClickListener(listenerSumar);
        restador.setOnClickListener(listenerRestar);


        return view;

    }

}
