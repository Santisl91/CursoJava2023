package Task_S1_08_Lambdas.N1_Ex07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("perro");
        list.add(32);
        list.add(100);
        list.add("peruano");
        list.add("coma");
        list.add(21);

        List<String> chains = list.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        List<Object> numbers = list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());


        chains.forEach(element -> System.out.println(element));

        numbers.forEach(element -> System.out.println(element));
    }
}

