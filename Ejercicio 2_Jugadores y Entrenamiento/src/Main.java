public class Main {

    public static void main(String[] args) {
	// write your code here
        JugadorDeFutbol jugadorUno = new JugadorDeFutbol("Mike",100,0,0,0);



        SesionDeEntrenamiento sesionUno = new SesionDeEntrenamiento(jugadorUno);
        sesionUno.entrenarA(jugadorUno);




    }
}
