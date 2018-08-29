public class Empleado {

    private String nombre;
    private Integer numeroDeLegajo;

    public Empleado(String nombre, Integer numeroDeLegajo) {
        this.nombre = nombre;
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado otroEmpleaado = (Empleado) obj;
        return this.numeroDeLegajo.equals(otroEmpleaado.getNumeroDeLegajo());
    }

    @Override
    public int hashCode() {
        return numeroDeLegajo.hashCode();
    }
}
