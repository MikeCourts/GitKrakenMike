public class Auto extends Vehiculo {

    private Integer peso = 1000;
    private Integer ruedas = 4;

    public Auto(Integer velocidad, String nombre, Integer aceleracion, Integer giro, Integer patente) {
        super(velocidad, nombre, aceleracion, giro, patente);
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }


}
