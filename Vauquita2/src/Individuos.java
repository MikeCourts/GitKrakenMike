import java.util.ArrayList;

public class Individuos implements ReceptorDiario {
    private String nombre;
    private Integer telefono;
    private Integer dni;
    private String direccion;

    public Individuos(String nombre, Integer telefono, Integer dni, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Integer getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void recibirDiario() {
        System.out.println("Soy un Individuo");
    }
}
