import java.util.HashMap;
import java.util.Map;

public class Ejercicio11 {
    public static void main(String[] args) {
        Map<String, Integer> quiniela = new HashMap<>();
        quiniela.put("Huevos", 0);
        quiniela.put("Agua", 1);
        quiniela.put("Escopeta", 2);
        quiniela.put("Caballo", 3);
        quiniela.put("Dentista", 4);
        quiniela.put("Llamas", 5);

        System.out.println(quiniela.get("Llamas"));

        if (quiniela.keySet().contains("Volar")) {
            System.out.println("Jugale al " + quiniela.get("Volar"));
        } else {
            System.out.println("No Juegues, vas a perder!!!");
        }

        //for (String clave: quiniela.keySet()) {
           // System.out.println(clave + " -> " + quiniela.get(clave));



        //}
    }
}
