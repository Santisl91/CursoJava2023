package Task_S1_08_Lambdas.N1_Ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> calendary = new ArrayList<>();

        calendary.add("January");
        calendary.add("Febreary");
        calendary.add("March");
        calendary.add("April");
        calendary.add("May");
        calendary.add("June");
        calendary.add("July");
        calendary.add("Agost");
        calendary.add("September");
        calendary.add("October");
        calendary.add("November");
        calendary.add("Dicember");

        calendary.forEach(month -> System.out.println(month));
    }
}
