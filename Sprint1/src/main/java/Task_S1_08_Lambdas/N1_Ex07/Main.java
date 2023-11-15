package Task_S1_08_Lambdas.N1_Ex07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("perro");
        list.add(32);
        list.add(100);
        list.add("peruano");
        list.add("coma");
        list.add(21);

        list.sort(Comparator.comparing(s -> s.toString().length()));

        list.forEach(System.out::println);
    }
}

