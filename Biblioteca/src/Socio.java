import java.util.ArrayList;
import java.util.List;

public abstract class Socio {
    private String nombre;
    private String apellido;
    private Integer numeroID;
    private Integer cantidadMaxima;
    private List<Ejemplar> listaEjemplaresSocio = new ArrayList<>();


    public Socio(String nombre, String apellido, Integer numeroID, List<Ejemplar> listaEjemplaresSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroID = numeroID;
        this.listaEjemplaresSocio = listaEjemplaresSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    public List<Ejemplar> getListaEjemplaresSocio() {
        return listaEjemplaresSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroID(Integer numeroID) {
        this.numeroID = numeroID;
    }

    public void setCantidadMaxima(Integer cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void setListaEjemplaresSocio(List<Ejemplar> listaEjemplaresSocio) {
        this.listaEjemplaresSocio = listaEjemplaresSocio;
    }

    public Boolean tieneCupoDisponible(){
        if(listaEjemplaresSocio.size() < cantidadMaxima){
            return true;
        } else {
            return false;
        }
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        listaEjemplaresSocio.add(unEjemplar);
    }

    public void devolverUnEjemplar(Ejemplar unEjemplar){
            listaEjemplaresSocio.remove(unEjemplar);
        }

    public boolean equals(Object obj){
        Socio otroSocio = (Socio) obj;
        return this.numeroID.equals(otroSocio.getNumeroID());
    }


}
