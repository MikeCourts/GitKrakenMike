public class Gato extends AnimalDomestico {
    //ATRIBUTOS
    private Integer vidas = 9;
    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }


    //METODOS/RESPONSABILIDADES
    @Override
    public void hacerRuido() {
        System.out.println("MIAU MIAU");
    }

    public void rasguniar(){
        System.out.println("guajj guajj");
    }
}
