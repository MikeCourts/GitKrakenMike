public class Vehiculo {

    private Integer velocidad;
    private String nombre;
    private Integer Aceleracion;
    private Integer giro;
    private Integer patente;

    public Vehiculo(Integer velocidad, String nombre, Integer aceleracion, Integer giro, Integer patente) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        Aceleracion = aceleracion;
        this.giro = giro;
        this.patente = patente;

    }



    public Integer getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAceleracion() {
        return Aceleracion;
    }

    public Integer getGiro() {
        return giro;
    }

    public Integer getPatente() {
        return patente;
    }
}
