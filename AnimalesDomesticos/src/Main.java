import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<AnimalDomestico> bolsaDeAnimales = new ArrayList<>();
        bolsaDeAnimales.add(new Perro("Firulais", "cruza calle"));
        bolsaDeAnimales.add(new Gato("Bola de nieve 1", "Simpsons"));

        for(Integer i = 0; i<bolsaDeAnimales.size();i++){
            AnimalDomestico iesimoAnimal = bolsaDeAnimales.get(i);
            iesimoAnimal.hacerRuido();
        }

        new AnimalDomestico("rosco", "bichon");



    }
}
