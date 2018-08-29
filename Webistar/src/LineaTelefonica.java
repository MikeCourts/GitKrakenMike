import java.util.List;

public class LineaTelefonica {
    private Cliente cliente;
    private Integer numeroTelefono;
    private Plan plan;
    private List<Llamada> listaLlamadas;

    public LineaTelefonica(Cliente cliente, Integer numeroTelefono, Plan plan, List<Llamada> listaLlamadas) {
        this.cliente = cliente;
        this.numeroTelefono = numeroTelefono;
        this.plan = plan;
        this.listaLlamadas = listaLlamadas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public Plan getPlan() {
        return plan;
    }

    public List<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void registrarLlamada(Double duracion){

    }

}
