import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Pato");
        listaString.add("Perro");
        listaString.add("Gato");

        try {
            System.out.println(listaString.get(5));
        } catch (NullPointerException e) {
            System.out.println("NO FUNCA VIEJA");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("NO HAY TANTOS INDEXES");
            e.printStackTrace();
        }
    }
}
