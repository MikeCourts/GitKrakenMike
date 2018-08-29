import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Auto auto1 = new Auto(150,"auto1",8,8,0111);
	    Auto auto2 = new Auto(140,"auto2",9,7,0222);
	    Moto moto1 = new Moto(120,"Moto1",8,4,1111);
	    Moto moto2 = new Moto(160,"Moto2",6,6,1222);

	    List<Vehiculo> listaSocorristas = new ArrayList<>();




	    List<Vehiculo> lista1 = new ArrayList<>();
	    lista1.add(auto1);
	    lista1.add(auto2);
	    lista1.add(moto1);
	    lista1.add(moto2);


	    Carrera carrera1 = new Carrera(25,10000,"Carrera UNO",4, new ArrayList<>(lista1));

		//carrera1.eliminarVehiculo(auto1);
	    //carrera1.darDeAltaAuto(auto3);
		//carrera1.darDeAltaMoto(moto3);

		System.out.println("El ganador es: " + carrera1.definirGanador());

    }
}
