package coleccionlinkedlist;

import java.util.LinkedList;

import java.util.*;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");
        LinkedList<String> capitales=new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");

        /* System.out.println(paises);
        System.out.println(capitales); */
        //Ejercicio 1
        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();
        while(iterB.hasNext()){
            if(iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }

        System.out.println(paises);
        //Ejercicio 2
       iterB=capitales.listIterator();
       while(iterB.hasNext()){
        iterB.next();
        if (iterB.hasNext()){
             iterB.next();
             iterB.remove();
        }

       }
       System.out.println(capitales);
       //Ejercicio 3
       paises.removeAll(capitales);
       System.out.println(paises);
    }
}
