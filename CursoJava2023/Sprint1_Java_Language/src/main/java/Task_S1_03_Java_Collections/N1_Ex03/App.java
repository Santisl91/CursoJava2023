package Task_S1_03_Java_Collections.N1_Ex03;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Map<String, String> paisesCapitales = new HashMap<>();

        String nombreArchivo = "/Users/santiagosantos/IdeaProjects/CursoJava2023/Sprint1_Java_Language/src/main/java/Task_S1_03_Java_Collections/N1_Ex03/countries.txt";

        try {
            BufferedReader lectorArchivo = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = lectorArchivo.readLine()) != null) {

                String[] partes = linea.split(" ");

                if (partes.length == 2) {
                    String pais = partes[0].trim();
                    String capital = partes[1].trim();
                    paisesCapitales.put(pais, capital);
                }
            }
            lectorArchivo.close();

            for (Map.Entry<String, String> entry : paisesCapitales.entrySet()) {
                System.out.println("País: " + entry.getKey() + ", Capital: " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        int puntuacion = 0;

        List<String> paises = new ArrayList<>(paisesCapitales.keySet());

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int indiceAleatorio = random.nextInt(paises.size());
            String paisAleatorio = paises.get(indiceAleatorio);
            String capitalCorrecta = paisesCapitales.get(paisAleatorio);

            System.out.println("Adivina la capital de " + paisAleatorio + ": ");
            String capitalUsuario = scanner.nextLine();

            if (capitalUsuario.equalsIgnoreCase(capitalCorrecta)) {
                System.out.println("¡Correcto! Ganaste un punto.");
                puntuacion++;
            } else {
                System.out.println("Incorrecto. La capital correcta es " + capitalCorrecta + ".");
            }
        }
        String nuevoArchivo = "/Users/santiagosantos/IdeaProjects/CursoJava2023/Sprint1_Java_Language/src/main/java/Task_S1_03_Java_Collections/N1_Ex03/clasificacion.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoArchivo, true));
            writer.write(nombreUsuario + ": " + puntuacion + " puntos");
            writer.newLine();
            writer.close();
            System.out.println("Puntuación guardada en clasificacion.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar la puntuación: " + e.getMessage());
        }

    }
}


