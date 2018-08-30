import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listaDeNombres = new ArrayList();
        listaDeNombres.add("Pablo");
        listaDeNombres.add("Jorge");
        listaDeNombres.add("Mike");
        listaDeNombres.add("Nacho");

        for (String elemento: listaDeNombres){
            System.out.println("“El nombre del alumno es: " + elemento);
        }

        }

    }

