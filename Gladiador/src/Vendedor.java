public class Vendedor {
    private String nombre;
    private Double carisma;
    private Double experiencia;
    private Integer matricula;

    public Vendedor(String nombre, Double carisma, Double experiencia, Integer matricula) {
        this.nombre = nombre;
        this.carisma = carisma;
        this.experiencia = experiencia;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCarisma() {
        return carisma;
    }

    public Double getExperiencia() {
        return experiencia;
    }

    public Integer getMatricula() {
        return matricula;
    }

}
