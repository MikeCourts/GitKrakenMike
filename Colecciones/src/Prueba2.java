import java.util.Set;

public class Prueba2 {
    public void sumaTotal(Set<Integer> conjuntoDeEnteros){
        for (Integer elemento: conjuntoDeEnteros) {
            elemento = elemento + elemento;
            System.out.println(elemento);
        }
    }
}


