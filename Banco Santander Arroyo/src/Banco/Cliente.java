package Banco;

public class Cliente {
    //ATRIBUTOS
    private Integer numeroCliente;
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    //CONSTRUCTOR

    public Cliente(Integer numeroCliente, String nombre, String apellido, Integer dni, Integer cuit) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }


    //METODOS

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getCuit() {
        return cuit;
    }
}
