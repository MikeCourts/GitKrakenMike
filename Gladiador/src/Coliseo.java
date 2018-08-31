import java.util.ArrayList;
import java.util.List;

public class Coliseo {

    private List<Gladiador> listaGladiadores = new ArrayList<>();
    private List<PersonalTrainer> listaPersonalTrainers = new ArrayList<>();
    private List<Enfermera> listaEnfermeras = new ArrayList<>();

    public List<Gladiador> getListaGladiadores() {
        return listaGladiadores;

    }

    public List<PersonalTrainer> getListaPersonalTrainers() {
        return listaPersonalTrainers;
    }

    public List<Enfermera> getListaEnfermeras() {
        return listaEnfermeras;
    }

    public void inscribirGladiador(Gladiador gladiador){

        listaGladiadores.add(gladiador);
        System.out.println(gladiador.getNombre() + " Se ha inscripto con exito.");
    }

    public void inscribirPersonalTrainer(PersonalTrainer personalTrainer){
        listaPersonalTrainers.add(personalTrainer);
        System.out.println(personalTrainer.getNombre() + " Se ha inscripto con exito.");
    }

    public void inscribirEnfermera(Enfermera enfermera){
        listaEnfermeras.add(enfermera);
        System.out.println(enfermera.getNombre() + " Se ha inscripto con exito.");
    }

    public void crearGladiador(String nombre, Double vida, Double ataque, Double defensa) {
        listaGladiadores.add(new Gladiador(nombre, vida, ataque, defensa));
}

/*
    public void crearGladiador(String nombre, Integer vida, Integer ataque, Integer defensa){
        Gladiador gladiador = new Gladiador();
        gladiador.setNombre(nombre);
        gladiador.setVida(vida);
        gladiador.setAtaque(ataque);
        gladiador.setDefensa(defensa);
        listaGladiadores.add(gladiador);
    }
   */

    public void crearPersonalTrainer(String nombre, Double porcentajeSubaDeAtributos){
        PersonalTrainer personalTrainer = new PersonalTrainer(nombre, porcentajeSubaDeAtributos);
        personalTrainer.setNombre(nombre);
        personalTrainer.setPorcentajeSubaDeAtributos(porcentajeSubaDeAtributos);
        listaPersonalTrainers.add(personalTrainer);

    }

    public void expulsarGladiador(Gladiador gladiador){
        listaGladiadores.remove(gladiador);
        System.out.println("Se ha expulsado del coliseo a " + gladiador);
    }

    public void entrenarGladiador(Gladiador gladiador, PersonalTrainer personalTrainer){
        Double ataque = gladiador.getAtaque();
        Double defensa = gladiador.getDefensa();
        ataque = gladiador.getAtaque() + gladiador.getAtaque() * personalTrainer.getPorcentajeSubaDeAtributos();
        defensa = gladiador.getDefensa() + gladiador.getDefensa() * personalTrainer.getPorcentajeSubaDeAtributos();
        System.out.println("***Entrenamiento Exitoso***");
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

    public void peleaDeGladiadores(Gladiador ataque, Gladiador defensa){
        Double daño = defensa.getDefensa() - ataque.getAtaque();
        System.out.println("Vida restante de "+ ataque.getNombre().toString() + ": " + (defensa.getVida() - daño));
    }

    public void verListaGladiadores(){
        System.out.println("***listaGladiadores***");
        for (Gladiador gladiador: listaGladiadores
             ) {
            System.out.println(gladiador.getNombre());
        }
        System.out.println("-------------------");

    }

    public void visitarEnfermeria(Gladiador gladiador){
        gladiador.setVida(100.0);
        //System.out.println("La vida de " + gladiador.getNombre() + " ha sido restaurada. Vida: " + gladiador.getVida());
        System.out.println(gladiador.getNombre() + " ha visitado la enfermeria. Nivel de Vida restaurada a: " + gladiador.getVida());
    }

    public void ventaProductos(Vendedor vendedor, Espectador espectador, Producto producto){
        Double precio = producto.getPrecio() + vendedor.getExperiencia() + vendedor.getCarisma();
        System.out.println(vendedor.getNombre() + " ha vendido " + producto.getNombre() + " por un total de " + precio);
    }



}
