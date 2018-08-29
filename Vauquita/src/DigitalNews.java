import java.util.List;

public class DigitalNews {
    private List<Cliente> listaClientes;

    public DigitalNews(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void notificarClientes() {
                for (Cliente cliente: listaClientes
             ) {
            System.out.println("Su diario esta disponible" + getListaClientes());

        }
    }
}
