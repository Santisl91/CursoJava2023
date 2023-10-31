package Task_S1_03_Java_Collections.N1_Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(12);
        listaNumeros.add(23);
        listaNumeros.add(45);
        listaNumeros.add(56);
        listaNumeros.add(67);

        List<Integer> listaInversa = new ArrayList<>();

        ListIterator<Integer> iterator = listaNumeros.listIterator(listaNumeros.size());

        while (iterator.hasPrevious()) {
            Integer elemento = iterator.previous();
            listaInversa.add(elemento);
        }

        System.out.println("Lista Original:");
        for (Integer numero : listaNumeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nLista Inversa:");
        for (Integer numero : listaInversa) {
            System.out.print(numero + " ");
        }
    }
}

