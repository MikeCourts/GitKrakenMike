import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listaDeString = new ArrayList<>();
        listaDeString.add("Pato");
        listaDeString.add("Perro");
        listaDeString.add("Gato");


        try {
            System.out.println(listaDeString.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("TU VIEJA");
            e.printStackTrace();
        }

    }
}
