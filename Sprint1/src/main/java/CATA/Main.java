package CATA;

import java.util.Arrays;

public class Main {

    public static void ordenarFinal(int[] lista) {

        int j = 0;

        for (int i : lista) {
            if (i != 0) {
                lista[j++] = i;
            }
        }

        for (int i = j; i < lista.length; i++) {
            lista[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] lista = {4, 0, 7, 0, 3, 2, 0};
        int[] lista2 = {4, 7, 3, 2, 0, 0, 0};

        ordenarFinal(lista);
        ordenarFinal(lista2);
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.toString(lista2));
    }
}
