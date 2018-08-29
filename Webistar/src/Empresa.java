import java.util.Date;

public class Empresa extends Cliente {
    private Integer cuit;
    private String nombreFantasia;

    public Empresa(Integer cliente, Date fechaIngreso) {
        super(cliente, fechaIngreso);
    }

    public Empresa(Integer cliente, Date fechaIngreso, Integer cuit, String nombreFantasia) {
        super(cliente, fechaIngreso);
        this.cuit = cuit;
        this.nombreFantasia = nombreFantasia;
    }

    public Integer getCuit() {
        return cuit;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }
}
