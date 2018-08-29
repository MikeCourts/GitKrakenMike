package Ejercitacion1;

import java.util.Scanner;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio2 {

    public static void main(String[] args){
        //Enunciado -- Declarar variables:  "unNumeroA" de tipo INTEGER
        //                                  "unNumeroB" de tipo DOUBLE
        //                                  "unaCadenaDeTexto" de tipo STRING
        //Luego, imprimir por pantalla:  el valor de cada variable
        //                               la suma de "unNumeroA" + "unNumeroB"
        //                               la diferencia entre "unNumeroA" - "unNUmeroB"

        //Comenzar a escribir código acá
    Integer unNumeroA = 1;
    Double unNumeroB = 2.5;
    String unaCadenaDeTexto = "uno mas dos igual a tres";

        System.out.println(unNumeroA);
        System.out.println(unNumeroB);
        System.out.println(unaCadenaDeTexto);
        System.out.println(unNumeroA + unNumeroB);
        System.out.println(unNumeroA - unNumeroB);
        System.out.println(unaCadenaDeTexto + " " + (unNumeroA + unNumeroB));
    }



















    static Boolean esImparMayorADiez(Integer number){
        if ((number % 2 == 1) && (number > 10)){
            return true;
        }

        return false;
    }


    static void contador(){
        int contador;
        for (contador = 1; contador < 10; contador++){
            System.out.println("contador: " + contador);
            contador = contador + 1;
        }

        //contador = contador + 1;
    }


    static void piedraPapelTijera(){
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        final int NONE = 0;
        int userChoise = NONE;

        System.out.println("Ingrese piedra, papel o tijera: ");
        Scanner scanner = new Scanner(System.in);
        String entradaDeTexto = scanner.nextLine();


        if (entradaDeTexto.equals("piedra")){
            userChoise = PIEDRA;
        } else if (entradaDeTexto.equals("papel")){
            userChoise = PAPEL;
        } else if (entradaDeTexto.equals("tijera")){
            userChoise = TIJERA;
        }

        int cpuChoice = (int) Math.round((Math.random() * (2)) + 1);
        if (cpuChoice == 1){
            System.out.println("piedra");
        } else if (cpuChoice == 2){
            System.out.println("papel");
        } else if (cpuChoice == 3) {
            System.out.println("tijera");
        }

        if (userChoise != NONE){
            if (cpuChoice == userChoise) {
                System.out.println("Empate");
            } else if ((cpuChoice + 1) % 3 == userChoise){
                System.out.println("Gano el usuario!");
            } else {
                System.out.println("Perdiste");
            }
        } else {
            System.out.println("Error");
        }
    }
}

