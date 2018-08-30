import java.util.HashSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        // write your code here
        HashSet<Integer> unConjunto = new HashSet();
        unConjunto.add(1);
        unConjunto.add(5);
        unConjunto.add(5);
        unConjunto.add(6);
        unConjunto.add(7);
        unConjunto.add(8);
        unConjunto.add(8);
        unConjunto.add(8);
        System.out.println(unConjunto);

        for (Integer elemento: unConjunto) {
            System.out.println(elemento);
        }
    }
}
