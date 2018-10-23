package digitalhouse.com.mundialapp.data;

public class Jugador {

    private String nombre;
    private String apellido;
    private String equipo;
    private String posicion;
    private Integer numero;
    private String habilidades;
    private String titulos;
    private Integer imagen;

    public Jugador(String nombre, String apellido, String equipo, String posicion, Integer numero, String habilidades, String titulos, Integer imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
        this.posicion = posicion;
        this.numero = numero;
        this.habilidades = habilidades;
        this.titulos = titulos;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", equipo='" + equipo + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numero=" + numero +
                ", habilidades='" + habilidades + '\'' +
                ", titulos='" + titulos + '\'' +
                '}';
    }


}
