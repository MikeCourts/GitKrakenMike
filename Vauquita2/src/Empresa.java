public class Empresa implements ReceptorDiario {
    private String nombre;
    private Integer telefono;
    private Integer cuit;
    private Integer cantidadEmpleados;

    public Empresa(String nombre, Integer telefono, Integer cuit, Integer cantidadEmpleados, String belgrano) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuit = cuit;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Integer getCuit() {
        return cuit;
    }

    public Integer getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    @Override
    public void recibirDiario() {
        System.out.println("Soy una Empresa");
    }
}
