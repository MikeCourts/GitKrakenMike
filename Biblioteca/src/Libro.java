import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String nombre;
    private Integer codigoISBN;
    private String autor;
    private List<Ejemplar> listaEjemplares = new ArrayList<>();

    public Libro(String nombre, Integer codigoISBN, String autor, List<Ejemplar> listaEjemplares) {
        this.nombre = nombre;
        this.codigoISBN = codigoISBN;
        this.autor = autor;
        this.listaEjemplares = listaEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoISBN() {
        return codigoISBN;
    }

    public String getAutor() {
        return autor;
    }

    public List<Ejemplar> getListaEjemplares() {
        return listaEjemplares;
    }


    public void agregarNuevoEjemplar(Ejemplar unEjemplar){
        listaEjemplares.add(unEjemplar);
        System.out.println("Se agrego el siguiente ejemplar a la lista: " + nombre);
    }

    public Boolean tieneEjemplaresDisponibles(){
        if (!listaEjemplares.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public Ejemplar prestarEjemplar(){
        {
            return listaEjemplares.remove(0);
        }
    }

    public void reingresarEjemplar(Ejemplar unEjemplar){
        listaEjemplares.add(unEjemplar);
    }

    public boolean equals(Object obj){
        Libro otroLibro = (Libro) obj;
        return this.codigoISBN.equals(otroLibro.getCodigoISBN());
    }


}

