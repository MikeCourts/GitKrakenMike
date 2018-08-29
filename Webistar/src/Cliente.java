import java.util.Date;

public class Cliente {
    private Integer cliente;
    private Date fechaIngreso;

    public Cliente(Integer cliente, Date fechaIngreso) {
        this.cliente = cliente;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getCliente() {
        return cliente;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
