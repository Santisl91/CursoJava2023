package Task_S1_08_Lambdas.N1_Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("Ciao", "linda", "Santiago", "Pedro", "Peru");

        List<String> result = listStrings
                .stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
