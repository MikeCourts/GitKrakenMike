public class Ejemplar {
    private Libro libro;
    private Integer numeroEdicion;
    private String ubicacion;

    public Ejemplar(Libro libro, Integer numeroEdicion, String ubicacion) {
        this.libro = libro;
        this.numeroEdicion = numeroEdicion;
        this.ubicacion = ubicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Integer getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
