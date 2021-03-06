package com.digitalhouse.comunicacinentrefragmentsbase;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFormulario extends Fragment {


    public FragmentFormulario() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflo el Layout del fragment
        View view =  inflater.inflate(R.layout.fragment_formulario, container, false);

        // Busco los componentes
        // Los editText so final porque son constantes debido a que son variables locales del onCreateView
        // y los estas usando dentro de la clase anonima que sabe ejecutar el click.
        final EditText editTextUsername = view.findViewById(R.id.editTextUsername);
        final EditText editTextPassword = view.findViewById(R.id.editTextPassword);
        Button buttonLogin = view.findViewById(R.id.buttonLogin);

        // Asocio el click al botón
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Cuando clickeo el botón, buco los strings que hay dentro de los editText.
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // TODO (18) Comunicarse con la Actividad y mandarle los valores extraidos de los editText
                //ESTO SE PODRIA CASTEAR el MainActivity, PERO ATA EL FRAGMENTO A ESTA ACTIVIDAD
                if (getContext() != null) {
                    OnFragmentFormNotify escuchador = (OnFragmentFormNotify) getContext();
                    escuchador.irSegundaActivity(username, password);
                }
            }
        });

        return view;
    }

    public interface OnFragmentFormNotify{
        public void irSegundaActivity(String username, String password);
    }

}
