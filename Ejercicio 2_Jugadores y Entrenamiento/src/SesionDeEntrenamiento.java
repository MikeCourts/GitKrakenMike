public class SesionDeEntrenamiento {

    //ATRIBUTOS
    private Integer experienciaGanada = 5;
    private JugadorDeFutbol jugadorDeFutbol;

    //CONSTRUCTOR


    public SesionDeEntrenamiento(JugadorDeFutbol jugadorDeFutbol) {
        this.jugadorDeFutbol = jugadorDeFutbol;
    }

    public Integer getExperienciaGanada() {
        return experienciaGanada;
    }

    public Integer entrenarA(JugadorDeFutbol nombre){
        jugadorDeFutbol.correr();
        jugadorDeFutbol.hacerGol();
        jugadorDeFutbol.correr();

        return experienciaGanada;
    }

}
