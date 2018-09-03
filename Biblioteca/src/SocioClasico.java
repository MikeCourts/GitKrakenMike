import java.util.List;

public class SocioClasico extends Socio {

    private Integer cantidadMaxima = 3;

    public SocioClasico(String nombre, String apellido, Integer numeroID, List<Ejemplar> listaEjemplaresSocio) {
        super(nombre, apellido, numeroID, listaEjemplaresSocio);
    }

    public Integer getCantidadMaxima() {
        return cantidadMaxima;
    }
}
