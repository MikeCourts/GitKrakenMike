public class AnimalDomestico {
    //ATRIBUTOS
    private String nombre;
    private Integer edad = 0;
    private String raza;
    private Integer energia = 50;

    //CONSTRUCTOR
    public AnimalDomestico(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    //METODOS/RESPONSABILIDADES
    public void comer(Integer racion) {
        energia = energia + racion;
        System.out.println("MMM Que Rico! Ahora tengo " + energia + " " + "energia");
    }

    public void dormir(Integer horas) {
        Integer energiaHoraSuenio = 5;
        energia = energia + (energiaHoraSuenio * horas);
        System.out.println("Dormi " + horas + " " + "horas. " + "Tengo " + energia + " energia.");
    }

    public void hacerRuido(){
        System.out.println("what does the animal say");
    }

    public void vomitar(){
        System.out.println(":(");
    }




}
