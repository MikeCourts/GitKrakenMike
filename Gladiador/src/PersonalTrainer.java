public class PersonalTrainer {
    private String nombre;
    private Double porcentajeSubaDeAtributos;

    public PersonalTrainer(String nombre, Double porcentajeSubaDeAtributos) {
        this.nombre = nombre;
        this.porcentajeSubaDeAtributos = porcentajeSubaDeAtributos;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPorcentajeSubaDeAtributos() {
        return porcentajeSubaDeAtributos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentajeSubaDeAtributos(Double porcentajeSubaDeAtributos) {
        this.porcentajeSubaDeAtributos = porcentajeSubaDeAtributos;
    }
}
