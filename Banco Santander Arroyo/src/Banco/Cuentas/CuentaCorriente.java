package Banco.Cuentas;

import Banco.Cheque;
import Banco.Cliente;

public class CuentaCorriente extends Cuenta{
    //ATRIBUTOS
    private Double montoDescubierto;

    //CONSTRUCTORES
    public CuentaCorriente(Integer numeroDeCuenta, Cliente cliente, Double montoDescubierto) {
        super(numeroDeCuenta, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    public CuentaCorriente(Integer numeroDeCuenta, Double saldo, Cliente cliente, Double montoDescubierto) {
        super(numeroDeCuenta, saldo, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    //GETTERS
    public Double getMontoDescubierto() {
        return montoDescubierto;
    }

    //METODOS
    public void depositarCheque(Cheque cheque){
        setSaldo(getSaldo() + cheque.getMonto());
        System.out.println("Cheque Depositado Correctamente. Su saldo es de: " + getSaldo());
    }

    @Override
    public Integer extraccion(Integer cantidad) {
        Boolean tengoSaldo = cantidad <= getSaldo();
        if(tengoSaldo){
            return super.extraccion(cantidad);
        } else {
            Double loQueTengo = (getSaldo() + montoDescubierto);
            if (loQueTengo < cantidad){
                System.out.println("Fondos Insuficientes");
                return -1;
            } else {
                setSaldo(getSaldo() - cantidad);
                System.out.println("Extraccion exitosa. Su Saldo es de: " + getSaldo());
                return cantidad;
            }
        }

    }
}
