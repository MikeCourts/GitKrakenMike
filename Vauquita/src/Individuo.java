public class Individuo extends Cliente {
    private Integer dni;
    private String direccion;

    public Individuo(String nombre, Integer telefono) {
        super(nombre, telefono);
    }


    public Integer getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }


}
