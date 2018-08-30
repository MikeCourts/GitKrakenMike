public class Ejercicio {

    public static void main(String[] args) {


        String numeroEscondido = "hola";
        Integer otroNumero = 0;
        try {
            Integer unNumero = Integer.parseInt(numeroEscondido);
            System.out.println(unNumero/otroNumero);
        } catch (NullPointerException e) {
            System.out.println("Aguante NULL");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Aguante / By Zero");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Aguante Cualquiera");
            e.printStackTrace();
        }
    }
}


