import java.util.ArrayList;

public class Impresora {
    //ATRIBUTOS
    private ArrayList<Imprimible> lista = new ArrayList<>();


    //RESPONSABILIDADES/METODOS

    public void imprimirTodo(){
        for(Integer i = 0; i <lista.size(); i++){
            Imprimible imprimibleEnPosision = lista.get(i);
            imprimibleEnPosision.imprimir();
        }

        lista.clear();
    }

    public void agregarImprimible(Imprimible imprimible){
        lista.add(imprimible);
    }

}
