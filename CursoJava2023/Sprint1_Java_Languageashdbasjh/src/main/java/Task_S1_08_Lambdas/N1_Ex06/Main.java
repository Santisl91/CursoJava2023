package Task_S1_08_Lambdas.N1_Ex06;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("santiago");
        list.add(32);
        list.add(100);
        list.add("santos");
        list.add("ciao");
        list.add(21);

        List<String> chains = list.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        List<Object> numbers = list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());


        chains.forEach(element -> System.out.println(element));

        numbers.forEach(element -> System.out.println(element));
    }
}

