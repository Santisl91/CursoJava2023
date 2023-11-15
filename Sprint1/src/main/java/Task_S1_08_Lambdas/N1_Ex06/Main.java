package Task_S1_08_Lambdas.N1_Ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("santiago");
        list.add(32);
        list.add(100);
        list.add("santos");
        list.add("ciao");
        list.add(21);

        list.sort(Comparator.comparing(s -> s.toString().length()));

        list.forEach(System.out::println);
    }
}

