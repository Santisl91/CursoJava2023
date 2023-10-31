package Task_S1_05_Utils.N1_Ex01;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String directoryPath = "/Users/santiagosantos/IdeaProjects/CursoJava2023";
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            String[] contents = directory.list();
            Arrays.sort(contents);

            System.out.println("Directorio ordenado alfabeticamente: ");
            for (String item : contents) {
                System.out.println(item);
            }
        } else {
            System.out.println("'" + directoryPath + "' no es un directorio.");
        }
    }
}
