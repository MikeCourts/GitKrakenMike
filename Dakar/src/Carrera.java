import java.util.List;

public class Carrera {

    private Integer distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private List<Vehiculo> listaDeSocorristas;

    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public Integer getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void darDeAltaSocorristaAuto(Vehiculo SocorristaAuto){
        listaDeSocorristas.add(SocorristaAuto);
    }


    public void darDeAltaAuto(Vehiculo auto) {
        Boolean hayCupo = listaDeVehiculos.size() < getCantidadDeVehiculosPermitidos();
        if (hayCupo) {
            listaDeVehiculos.add(auto);
        } else {
            System.out.println("No hay cupo");
        }

    }

    public void darDeAltaMoto(Vehiculo moto) {
        Boolean hayCupo = listaDeVehiculos.size() < getCantidadDeVehiculosPermitidos();
        if (hayCupo) {
            listaDeVehiculos.add(moto);
        } else {
            System.out.println("No hay cupo");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(Vehiculo patente) {
        listaDeVehiculos.remove(patente);
    }

    public String definirGanador() {
        Vehiculo ganador = listaDeVehiculos.get(0);

        for (Vehiculo vehiculo : listaDeVehiculos
        ) {
            // todo: Velocidad * ½ Aceleracion / (Giro*(Peso-Cantidad de Ruedas * 100)
            Integer formula = null;
            Integer formulaGanador = null;
            if (ganador instanceof Auto) {
                Auto auto = (Auto) ganador;
                formulaGanador = auto.getVelocidad() * 1 / 2 * auto.getAceleracion() / auto.getGiro() *
                        ((auto.getPeso() - auto.getRuedas() * 100));

            } else if (ganador instanceof Moto) {
                Moto moto = (Moto) ganador;
                formulaGanador = moto.getVelocidad() * 1 / 2 * moto.getAceleracion() / moto.getGiro() *
                        ((moto.getPeso() - moto.getRuedas() * 100));
            }


            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                formula = auto.getVelocidad() * 1 / 2 * auto.getAceleracion() / auto.getGiro() *
                        ((auto.getPeso() - auto.getRuedas() * 100));

            } else if (vehiculo instanceof Moto) {
                Moto moto = (Moto) vehiculo;
                formula = moto.getVelocidad() * 1 / 2 * moto.getAceleracion() / moto.getGiro() *
                        ((moto.getPeso() - moto.getRuedas() * 100));
            }

            if (formula > formulaGanador) {
                ganador = vehiculo;
            }


        }

        return ganador.getNombre();

    }



}
