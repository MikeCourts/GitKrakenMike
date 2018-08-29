import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> listaDeEmpleados = new ArrayList<>();

        Empleado empleado1 = new Empleado("Empleado1", 1);
        Empleado empleado2 = new Empleado("Empleado2", 2);
        Empleado empleado3 = new Empleado("Empleado3", 3);
        Empleado empleado4 = new Empleado("Empleado4", 4);

        listaDeEmpleados.add(empleado1);
        listaDeEmpleados.add(empleado2);
        listaDeEmpleados.add(empleado3);
        listaDeEmpleados.add(empleado4);

        Empleado empleado5 = new Empleado("Empleado5", 4);

        Boolean estaOno = listaDeEmpleados.contains(empleado5);

        System.out.println(estaOno);

    }
}
