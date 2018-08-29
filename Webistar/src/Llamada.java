import java.util.Date;

public class Llamada {
    private Date fechaLlamada;
    private Double duracion;
    private Double costo;

    public Llamada(Date fechaLlamada, Double duracion, Double costo) {
        this.fechaLlamada = fechaLlamada;
        this.duracion = duracion;
        this.costo = costo;
    }

    public Date getFechaLlamada() {
        return fechaLlamada;
    }

    public Double getDuracion() {
        return duracion;
    }

    public Double getCosto() {
        return costo;
    }
}
