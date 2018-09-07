import java.util.Objects;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean equals(Object obj) {
        Profesor otroProfesor = (Profesor) obj;
        return this.codigoProfesor.equals(otroProfesor.getCodigoProfesor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoProfesor);
    }
}
