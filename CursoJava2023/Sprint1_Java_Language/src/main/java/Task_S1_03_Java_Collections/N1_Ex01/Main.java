package Task_S1_03_Java_Collections.N1_Ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Month> calendario = new ArrayList<Month>();

        calendario.add(new Month("Enero"));
        calendario.add(new Month("Febrero"));
        calendario.add(new Month("Marzo"));
        calendario.add(new Month("Abril"));
        calendario.add(new Month("Mayo"));
        calendario.add(new Month("Junio"));
        calendario.add(new Month("Julio"));
        calendario.add(7,new Month("Agosto"));
        calendario.add(new Month("Setiembre"));
        calendario.add(new Month("Octubre"));
        calendario.add(new Month("Noviembre"));
        calendario.add(new Month("Diciembre"));

        for(Month mes:calendario){
            System.out.println("El calenmdario tiene los meses: " + mes.getName());
        }

        HashSet<Month> calendarioHash = new HashSet<>(calendario);

        calendario.add(new Month("Diciembre"));
        calendario.add(new Month("Diciembre"));
        calendario.add(new Month("Diciembre"));

        for(Month mesHash:calendarioHash){
            System.out.println("Mes: " + mesHash.getName());
        }
    }
}
