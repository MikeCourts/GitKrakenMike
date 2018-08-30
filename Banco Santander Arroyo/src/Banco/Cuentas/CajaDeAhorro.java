package Banco.Cuentas;

import Banco.Cliente;


public class CajaDeAhorro extends Cuenta {
    //ATRIBUTOS
    private Double tasaDeInteres;

    //CONSTRUCTORES
    public CajaDeAhorro(Integer numeroDeCuenta, Cliente cliente, Double tasaDeInteres) {
        super(numeroDeCuenta, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    public CajaDeAhorro(Integer numeroDeCuenta, Double saldo, Cliente cliente, Double tasaDeInteres) {
        super(numeroDeCuenta, saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }


    //GETTER
    public Double getTasaDeInteres() {
        return tasaDeInteres;
    }

    //METODOS
    public void sumarInteres() {
        setSaldo(getSaldo() +(getSaldo() * tasaDeInteres));
    }
}
