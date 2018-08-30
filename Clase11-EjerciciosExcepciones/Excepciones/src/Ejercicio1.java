public class Ejercicio1 {

    public static void main(String[] args) {
        Integer unNumero = null;


        try {
            System.out.println(unNumero + 5);

        } catch (NullPointerException e){
            System.out.println("NO FUNCA");
            e.printStackTrace();
        }



    }
}


