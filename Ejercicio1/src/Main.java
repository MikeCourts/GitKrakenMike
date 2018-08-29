public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Persona Uno", 12345678);
        Persona persona2 = new Persona("Persona Dos", 12345678);

        Boolean sonIguales = persona1.equals(persona2);

        System.out.println(sonIguales);

    }
}
