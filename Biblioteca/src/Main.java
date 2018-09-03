import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Libro libro1 = new Libro("Libro1", 1, "Autor1", new ArrayList<>());
        Ejemplar ejemplar1 = new Ejemplar(libro1, 1, "Al fondo y a la derecha");
        libro1.agregarNuevoEjemplar(ejemplar1);
        SocioClasico socioClasico1 = new SocioClasico("Socio1", "Clasico1", 1, new ArrayList<>());

        Biblioteca biblioteca1 = new Biblioteca(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        biblioteca1.prestar(1,1);


        libro1.tieneEjemplaresDisponibles();

    }
}
