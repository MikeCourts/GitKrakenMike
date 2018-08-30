import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> listaUno = new ArrayList();
        listaUno.add(1);
        listaUno.add(5);
        listaUno.add(5);
        listaUno.add(6);
        listaUno.add(7);
        listaUno.add(8);
        listaUno.add(8);
        listaUno.add(8);
        System.out.println(listaUno);

        //por cada elemento del tipo Integer dentro de listaUno
        for(Integer elemento: listaUno){
            System.out.println(elemento);
        }

    }
}
