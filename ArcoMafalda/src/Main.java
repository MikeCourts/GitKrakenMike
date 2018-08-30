import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Arco arco1 = new Arco("Rojo", 20.00);
        Arco arco2 = new Arco("Verde", 30.00);
        Arco arco3 = new Arco("Amarillo", 20.00);
        Arco arco4 = new Arco("Azul", 20.00);
        Arco arco5 = new Arco("Negro", 20.00);
        Arco arco6 = new Arco("Rosa", 20.00);

        List<Arco> listaDeArcos = new ArrayList<>();
        listaDeArcos.add(arco1);
        listaDeArcos.add(arco2);
        listaDeArcos.add(arco3);
        listaDeArcos.add(arco4);
        listaDeArcos.add(arco5);
        listaDeArcos.add(arco6);

        Arco arco7 = new Arco("Rojo", 20.00);
        Boolean contieneOno = listaDeArcos.contains(arco7);

        arco7.disparar("========|>");

        System.out.println(contieneOno);






    }
}
