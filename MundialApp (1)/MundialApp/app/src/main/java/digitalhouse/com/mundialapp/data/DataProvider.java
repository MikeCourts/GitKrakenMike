package digitalhouse.com.mundialapp.data;

import java.util.ArrayList;
import java.util.List;

import digitalhouse.com.mundialapp.R;

/**
 * Created by edu on 23/05/18.
 */

public class DataProvider {

    List<Jugador> listaDeJugadores = new ArrayList<>();


    public List<Jugador> getListaDeJugadores() {
        listaDeJugadores.add(new Jugador("Lionel","Messi","FC BARCELONA","DELANTERO",10,"MEJOR DEL MUNDO","Muchos...",R.drawable.messi));
        listaDeJugadores.add(new Jugador("Gonzalo","Higuain","JUVENTUS","DELANTERO",9,"ERRAR","Algunos", R.drawable.higuain));
        listaDeJugadores.add(new Jugador("Javier ","Mascherano","Hebei China Fortune","VOLANTE",5,"Lider","Muchos...", R.drawable.mascherano));
        return listaDeJugadores;
    }
}
