import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Individuo individuo1 = new Individuo("Mike", 1555555555);
        Empresa empresa1 = new Empresa("empresa1", 1544444444);
        Empresa empresa2 = new Empresa("empresa2",1500000000);
        Individuo individuo2 = new Individuo("Pablo", 1566666666);

        List<Cliente> lista1 = new ArrayList<>();

        DigitalNews diario = new DigitalNews(lista1);

        diario.agregarCliente(individuo1);
        diario.agregarCliente(empresa1);
        diario.agregarCliente(empresa2);
        diario.agregarCliente(individuo2);

        diario.notificarClientes();

    }
}
