import java.util.Date;

public class Individuos extends Cliente {
    private Integer dni;
    private String nombre;
    private String apellido;

    public Individuos(Integer cliente, Date fechaIngreso) {
        super(cliente, fechaIngreso);
    }

    public Individuos(Integer cliente, Date fechaIngreso, Integer dni, String nombre, String apellido) {
        super(cliente, fechaIngreso);
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
