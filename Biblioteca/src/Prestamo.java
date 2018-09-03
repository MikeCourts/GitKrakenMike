import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaDelDia = new Date();

    public Prestamo(Ejemplar ejemplar, Socio socio, Date fechaDelDia) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        this.fechaDelDia = fechaDelDia;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Socio getSocio() {
        return socio;
    }

    public Date getFechaDelDia() {
        return fechaDelDia;
    }
}
