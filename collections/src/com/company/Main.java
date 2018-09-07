package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //CREACION DE UN ARRAY LIST DE INTEGERS
        List<Integer> listadoNumeros = new ArrayList<>();


        //AGREGO AL ARRAY LIST ALGUNOS NUMEROS
        listadoNumeros.add(28);
        listadoNumeros.add(211);
        listadoNumeros.add(12);
        listadoNumeros.add(9);
        listadoNumeros.add(3);

        //FOR EACH: PRIMERO LE DIGO EL TIPO DE DATO QUE VA A IR RECORRIENDO
        //COMO ES UN ARRAY DE INTEGERS, ENTONCES POR CADA POSICION IRA OBTENIENDO UN INTEGER
        //EN SEGUNDO LUGAR LE PONGO UN NOMBRE DE REFERENCIA PARA QUE EN CADA ITERACION DEL FOR EACH
        //LO QUE SE VA RECORRIENDO EN CADA ITERACION SE VAYA GUARDANDO EN LA VARIABLE DE ESE NOMBRE
        //EN ESTE CASO SE LLAMA "unNumero". POR ULTIMO, EN TERCER LUGAR PONEMOS EL NOMBRE DEL LISTADO
        //QUE QUEREMOS RECORRER, EN ESTE CASO "listadoNumeros".
        for(Integer unNumero : listadoNumeros){
            //en la variable unNumero en cada iteracion se va guardando el valor de lo que recorre
            //el for each en cada iteracion. Esto equivale a en un for comun hacer: listadoNumero.get(i)
            System.out.println(unNumero);
        }

        //imprimo el tamaño del listado, usando el metodo .size()
        System.out.println("el tamaño del listado es: " + listadoNumeros.size());

        //---------------------HASH SET -----------------------------

        //CREO UN CONJUNTO, CUYA CARACTERISTICA ES QUE NO PERMITE REPETIDOS, Y NO MANTIENE UN ORDEN.
        Set<String> conjuntoDeNombres = new HashSet<>();

        //AGREGO NOMBRES A MI CONJUNTO DE STRING. COMO ESTOY AGREGANDO MARIANO 3 VECES, Y EL HASH SET
        //NO ACEPTA REPETIDOS, ENTONCES SOLO LO AGREGARA 1 VEZ.
        conjuntoDeNombres.add("Mariano");
        conjuntoDeNombres.add("Mariano");
        conjuntoDeNombres.add("Mariano");
        conjuntoDeNombres.add("Juan");
        conjuntoDeNombres.add("Pepe");


        //IDEM AL FOR EACH DE ARRIBA PERO PARA RECORRER UN CONJUNTO EN VEZ DE UN LISTADO
        //(MISMA ESTRUCTURA Y EXPLICACION QUE EN EL FOR EACH DE ARRIBA)
        for(String unNombre : conjuntoDeNombres){
            System.out.println(unNombre);
        }


        System.out.println("el tamaño del conjunto es: " + conjuntoDeNombres.size());




    }
}
