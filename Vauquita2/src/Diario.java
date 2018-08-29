import java.util.ArrayList;

public class Diario {
    private ArrayList<ReceptorDiario> listaReceptores = new ArrayList<>();


    public void agregarReceptor(ReceptorDiario receptorDiario){
        listaReceptores.add(receptorDiario);
        System.out.println("Felicidades " + receptorDiario + "! Te has suscrito al " + listaReceptores);
    }

    public void notificarReceptores(){
        for (Integer i = 0; i < listaReceptores.size();i++) {
            ReceptorDiario receptoresEnLista = listaReceptores.get(i);
            receptoresEnLista.recibirDiario();
        }
    }



}
