public class Coca {
    private Integer tamanio;
    private Double precio;

    public Coca(Integer tamanio, Double precio) {
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Double getPrecio() {
        return precio;
    }

    public boolean equals(Object obj){
        Coca otraCoca = (Coca) obj;
        return this.tamanio.equals(otraCoca.getTamanio());
    }
}
