package digitalhouse.com.mundialapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import digitalhouse.com.mundialapp.data.Jugador;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleJugadorFragment extends Fragment {
    // TODO 4 Crear las Claves para recibir por Bundle los datos
    // private static final String KEY_EXAMPLE = "keyExample";


    public static DetalleJugadorFragment factory(Jugador jugador){
        // TODO 5 instanciar DetalleJugadorFragment y cargarle los datos del jugador mediante un Bundle

        return null;
    }


    public DetalleJugadorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO 6 Desarmar el Bundle y obtener los datos del jugador


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_jugador, container, false);

        // TODO 7 Buscar los componentes dentro de la vista
        // TODO 8 Setear los datos del jugador a los componentes

        return view;
    }

}
