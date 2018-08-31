public class Main {

    public static void main(String[] args) {
	// write your code here

        Coliseo coliseo1 = new Coliseo();
        PersonalTrainer personalTrainer1 = new PersonalTrainer("trainer1", 0.05);
        Gladiador gladiador1 = new Gladiador("gladiador1", 100.0, 70.0, 80.0);
        Gladiador gladiador2 = new Gladiador("gladiador2", 100.0, 75.0,75.0);
        coliseo1.inscribirPersonalTrainer(personalTrainer1);
        coliseo1.inscribirGladiador(gladiador1);
        coliseo1.inscribirGladiador(gladiador2);
        coliseo1.entrenarGladiador(gladiador1, personalTrainer1);
        coliseo1.verListaGladiadores();

        System.out.println(gladiador2.getDefensa() - gladiador1.getAtaque());

        coliseo1.peleaDeGladiadores(gladiador1, gladiador2);

        gladiador1.verInfoGladiador();
        coliseo1.visitarEnfermeria(gladiador1);

        Vendedor vendedor1 = new Vendedor("Vendedor1", 7.0, 2.5, 1);
        Espectador espectador1 = new Espectador("espectador1");
        Producto producto1 = new Producto("Pizza Hawaiana", 12.50);
        coliseo1.ventaProductos(vendedor1,espectador1,producto1);







    }
}
