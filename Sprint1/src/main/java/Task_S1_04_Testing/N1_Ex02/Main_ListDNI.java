package Task_S1_04_Testing.N1_Ex02;

import java.util.ArrayList;
import java.util.List;

public class Main_ListDNI {
    public static void main(String[] args) {

        List<CalculoDni> listaDNI = new ArrayList<>();

        CalculoDni numDNI1 = new CalculoDni(345678567);
        CalculoDni numDNI2 = new CalculoDni(123234345);
        CalculoDni numDNI3 = new CalculoDni(345456567);
        CalculoDni numDNI4 = new CalculoDni(321432543);
        CalculoDni numDNI5 = new CalculoDni(654765876);
        CalculoDni numDNI6 = new CalculoDni(987876765);
        CalculoDni numDNI7 = new CalculoDni(456765345);
        CalculoDni numDNI8 = new CalculoDni(543456543);
        CalculoDni numDNI9 = new CalculoDni(334455334);
        CalculoDni numDNI10 = new CalculoDni(222333444);

        listaDNI.add(numDNI1);
        listaDNI.add(numDNI2);
        listaDNI.add(numDNI3);
        listaDNI.add(numDNI4);
        listaDNI.add(numDNI5);
        listaDNI.add(numDNI6);
        listaDNI.add(numDNI7);
        listaDNI.add(numDNI8);
        listaDNI.add(numDNI9);
        listaDNI.add(numDNI10);


        for (CalculoDni dni : listaDNI) {
            char letraDNI = CalculoDni.calcularLetrasDNI(dni.getDniNumber());
            System.out.println("la letra del DNI " + dni.getDniNumber() + " es:" + letraDNI);

        }
    }
}
