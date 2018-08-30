package Banco;

import java.util.Date;

public class Cheque {
    //ATRIBUTOS
    private Double monto;
    private String bancoEmisor;
    private Date fechaDePago;

    //CONSTRUCTOR
    public Cheque(Double monto, String bancoEmisor, Date fechaDePago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDePago = fechaDePago;
    }

    //GETTERS(METODOS)
    public Double getMonto() {
        return monto;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public Date getFechaDePago() {
        return fechaDePago;
    }
}
