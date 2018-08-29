public class Empresa extends Cliente {
    private Integer cuit;
    private Integer cantidadEmpleados;

    public Empresa(String nombre, Integer telefono) {
        super(nombre, telefono);
    }


    public Integer getCuit() {
        return cuit;
    }

    public Integer getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}
