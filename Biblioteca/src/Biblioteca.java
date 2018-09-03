import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;
    private List<Socio> listaSocios;
    private List<Prestamo> listaPrestamos;

    public Biblioteca(List<Libro> listaLibros, List<Socio> listaSocios, List<Prestamo> listaPrestamos) {
        this.listaLibros = listaLibros;
        this.listaSocios = listaSocios;
        this.listaPrestamos = listaPrestamos;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public List<Socio> getListaSocios() {
        return listaSocios;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void prestar(Integer codigoISBN, Integer numeroID){
        Libro libro1 = null;
        Socio socio1 = null;
        for (Libro libro: listaLibros)
        {
            if(codigoISBN.equals(libro)){
                libro1 = libro;
                break;
            }

        }

        for (Socio socio: listaSocios)
        {
            if(numeroID.equals(socio)){
                socio1 = socio;
                break;
            }
        }

        if(libro1.tieneEjemplaresDisponibles() && socio1.tieneCupoDisponible()){

            Ejemplar ejemplar = libro1.prestarEjemplar();
            socio1.tomarPrestadoUnEjemplar(ejemplar);
            Prestamo prestamo = new Prestamo(ejemplar, socio1, new Date());
            listaPrestamos.add(prestamo);
        }
    }

    public void devolver (Ejemplar unEjemplar, Integer numeroID){
        for (Socio socio: listaSocios) {
            if(numeroID.equals(socio)){
                break;
            }
            socio.devolverUnEjemplar(unEjemplar);
        }

        for (Libro libro: listaLibros) {

            if(unEjemplar.equals(libro)){
                break;
            }
            libro.reingresarEjemplar(unEjemplar);

        }
        System.out.println("El Socio #" + numeroID + "ha devuelto el ejemplar #" + unEjemplar);
    }



}
