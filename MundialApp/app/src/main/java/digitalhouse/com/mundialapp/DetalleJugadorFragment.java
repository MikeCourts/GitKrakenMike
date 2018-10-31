package digitalhouse.com.mundialapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import digitalhouse.com.mundialapp.data.Jugador;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleJugadorFragment extends Fragment {
    // TODO 4 Crear las Claves para recibir por Bundle los datos
    // private static final String KEY_EXAMPLE = "keyExample";
    private static final String KEY_NOMBRE = "keyNombre";
    private static final String KEY_APELLIDO = "apellido";
    private static final String KEY_EQUIPO = "equipo";
    private static final String KEY_POSICION = "posicion";
    private static final Integer KEY_NUMERO = 0;
    private static final String KEY_HABILIDADES = "habilidades";
    private static final String KEY_TITULOS = "titulos";
    private static final Integer KEY_IMAGEN = 0;



    public static DetalleJugadorFragment factory(Jugador jugador){
        // TODO 5 instanciar DetalleJugadorFragment y cargarle los datos del jugador mediante un Bundle
        DetalleJugadorFragment detalleJugadorFragment = new DetalleJugadorFragment();
        Bundle bundleNombre = new Bundle();
        Bundle bundleApellido = new Bundle();
        Bundle bundleEquipo = new Bundle();
        Bundle bundlePosicion = new Bundle();
        Bundle bundleNumero = new Bundle();
        Bundle bundleHabilidades = new Bundle();
        Bundle bundleTitulos = new Bundle();
        Bundle bundleImagen = new Bundle();
        bundleNombre.putString(KEY_NOMBRE, jugador.getNombre());
        bundleApellido.putString(KEY_APELLIDO, jugador.getApellido());
        bundleEquipo.putString(KEY_EQUIPO, jugador.getEquipo());
        bundlePosicion.putString(KEY_POSICION, jugador.getPosicion());
        bundleNumero.putInt(String.valueOf(KEY_NUMERO), jugador.getNumero());
        bundleHabilidades.putString(KEY_HABILIDADES, jugador.getHabilidades());
        bundleTitulos.putString(KEY_TITULOS, jugador.getTitulos());
        bundleImagen.putInt(String.valueOf(KEY_IMAGEN), jugador.getImagen());



        return null;
    }


    public DetalleJugadorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO 6 Desarmar el Bundle y obtener los datos del jugador
        Bundle bundle = getArguments();
        String nombre = bundle.getString(KEY_NOMBRE);
        String apellido = bundle.getString(KEY_APELLIDO);
        String equipo = bundle.getString(KEY_EQUIPO);
        String posicion = bundle.getString(KEY_POSICION);
        Integer numero = bundle.getInt(String.valueOf(KEY_NUMERO));
        String habilidades = bundle.getString(KEY_HABILIDADES);
        String titulos =  bundle.getString(KEY_TITULOS);
        Integer imagen = bundle.getInt(String.valueOf(KEY_IMAGEN));


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_jugador, container, false);

        // TODO 7 Buscar los componentes dentro de la vista
        ImageView imageView = view.findViewById(R.id.imageViewImagenJugador);
        TextView textViewNombre = view.findViewById(R.id.textViewNombreJugador);
        TextView textViewEquipo = view.findViewById(R.id.textViewEquipoJugador);
        TextView textViewPosicion = view.findViewById(R.id.textViewPosicionJugador);
        TextView textViewNumero = view.findViewById(R.id.textViewNumeroJugador);
        TextView textViewHabilidades = view.findViewById(R.id.textViewHabilidadesJugador);
        TextView textViewTitulos = view.findViewById(R.id.textViewTitulosObtenidosJugador);


        // TODO 8 Setear los datos del jugador a los componentes
        imageView.setImageResource(imagen);
        textViewNombre.setText(nombre + " " + apellido);
        textViewEquipo.setText(equipo);
        textViewPosicion.setText(posicion);
        textViewNumero.setText(numero);
        textViewHabilidades.setText(habilidades);
        textViewTitulos.setText(titulos);


        return view;
    }

}
