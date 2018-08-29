import java.util.ArrayList;

public class Combo implements Consumible {


    //ATRIBUTOS
    private Double descuento;
    private ArrayList<Consumible> listaDeConsumibles = new ArrayList<>();

    public Combo(Double descuento, ArrayList<Consumible> listaDeConsumibles) {
        this.descuento = descuento;
        this.listaDeConsumibles = listaDeConsumibles;
    }

    @Override
    public Double darPrecio() {
        Double totalSinDescuento = 0.0;

        for(Integer i = 0; i<listaDeConsumibles.size();i++){
            Consumible consumible = listaDeConsumibles.get(i);
            Double precio = consumible.darPrecio();
            totalSinDescuento = totalSinDescuento + precio;

            }
            return totalSinDescuento - descuento;
        }

    @Override
    public String darDescripcion() {
        String listaDeDescripciones = "";

        for(Integer i = 0; i<listaDeConsumibles.size(); i++){
            Consumible consumible = listaDeConsumibles.get(i);
            String descripcion = consumible.darDescripcion();
            listaDeDescripciones = listaDeDescripciones + descripcion;


        }
        return listaDeDescripciones;

    }
}
