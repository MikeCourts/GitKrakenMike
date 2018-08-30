package Banco;

import Banco.Cuentas.CajaDeAhorro;
import Banco.Cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente mike = new Cliente(17, "Mike", "Courts", 33786890, 2033786890);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1234, mike, 2500.00);
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(1234, mike, 0.15);

        cajaDeAhorro.deposito(15000);
        //cajaDeAhorro.extraccion(1500);

        cajaDeAhorro.sumarInteres();


    }
}
