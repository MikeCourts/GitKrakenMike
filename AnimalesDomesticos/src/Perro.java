public class Perro extends AnimalDomestico {
    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    //ATRIBUTOS HEREDA DEL PADRE (AnimalDomestico)..

    //METODOS/RESPONSABILIDADES
    @Override
    public void hacerRuido() {
        System.out.println("GUAU GUAU");
    }
}
