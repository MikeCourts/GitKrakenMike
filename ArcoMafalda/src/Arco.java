public class Arco {
    //ATRIBUTOS
    private String color;
    private Double precio;

    //CONSTRUCTOR
    public Arco(String color, Double precio) {
        this.color = color;
        this.precio = precio;
    }

    //GETTER
    public String getColor() {
        return color;
    }

    public Double getPrecio() {
        return precio;
    }

    //SETTER
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //RESPONSABILIDADES
    public void disparar(String flecha){
        System.out.println(flecha);
    }

    @Override
    public boolean equals(Object obj) {
        Arco otroArco = (Arco) obj;
       return this.color.equals(otroArco.getColor());
    }
}
