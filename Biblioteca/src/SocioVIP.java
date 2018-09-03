import java.util.List;

public class SocioVIP extends Socio {
    private Integer cuotaMensual;
    private Integer cantidadMaxima = 15;

    public SocioVIP(String nombre, String apellido, Integer numeroID, List<Ejemplar> listaEjemplaresSocio) {
        super(nombre, apellido, numeroID, listaEjemplaresSocio);
    }

    public SocioVIP(String nombre, String apellido, Integer numeroID, List<Ejemplar> listaEjemplaresSocio, Integer cuotaMensual) {
        super(nombre, apellido, numeroID, listaEjemplaresSocio);
        this.cuotaMensual = cuotaMensual;
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public Integer getCantidadMaxima() {
        return cantidadMaxima;
    }
}
