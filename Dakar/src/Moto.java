public class Moto extends Vehiculo {

    private Integer peso = 300;
    private Integer ruedas = 2;

    public Moto(Integer velocidad, String nombre, Integer aceleracion, Integer giro, Integer patente) {
        super(velocidad, nombre, aceleracion, giro, patente);
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }



}
