public class Main {

    public static void main(String[] args) {

        Coca coca1 = new Coca(10,15.50);
        Coca coca2 = new Coca(10, 20.00);

        Boolean sonIguales = coca1.equals(coca2);

        System.out.println(sonIguales);


    }
}
