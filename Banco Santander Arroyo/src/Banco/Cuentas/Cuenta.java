package Banco.Cuentas;

import Banco.Cliente;

public class Cuenta {
    //ATRIBUTOS
    private Integer numeroDeCuenta;
    private Double saldo = 0.0;
    private Cliente cliente;

    //CONSTRUCTORES


    public Cuenta(Integer numeroDeCuenta, Cliente cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
    }

    public Cuenta(Integer numeroDeCuenta, Double saldo, Cliente cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //GETTER(METODOS)
    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //SETTER


    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //METODOS
    public void deposito(Integer cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Deposito Exitoso de: " + cantidad);
        System.out.println("Saldo Actual: " + saldo);

    }

    public Integer extraccion(Integer cantidad) {
        if(cantidad > saldo) {
            System.out.println("Fondos Insuficientes");
        } else {
            saldo = saldo - cantidad;
            System.out.println("Extraccion: " + cantidad);
            System.out.println("Su Saldo es de: " + saldo);
        }

        return cantidad;
    }


}
