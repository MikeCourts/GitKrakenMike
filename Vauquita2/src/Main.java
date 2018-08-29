import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Individuos individuo1 = new Individuos("Mike Courts",1511111111,33786890,"Doblas 528");
        Empresa empresa1 = new Empresa("Tiarg", 1522222222, 3333333, 20, "Belgrano");


        Diario MonroeStreetJournal = new Diario();
        MonroeStreetJournal.agregarReceptor(individuo1);
        MonroeStreetJournal.agregarReceptor(empresa1);
        MonroeStreetJournal.notificarReceptores();

    }
}
