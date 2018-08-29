public class Producto implements Consumible{

    //ATRIBUTOS
    private Double precio;
    private String descripcion;

    public Producto(Double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }



    @Override
    public Double darPrecio() {
        return precio;
    }

    @Override
    public String darDescripcion() {
        return descripcion;


    }
}
