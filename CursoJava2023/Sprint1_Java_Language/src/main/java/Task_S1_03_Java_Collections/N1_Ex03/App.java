package Task_S1_03_Java_Collections.N1_Ex03;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Leer el archivo countries.txt y almacenar los datos en un HashMap
        HashMap<String, String> mapaPaisesCapitales = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("countries.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String pais = partes[0].trim();
                    String capital = partes[1].trim();
                    mapaPaisesCapitales.put(pais, capital);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Pedir el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        int puntuacion = 0;
        Random random = new Random();

        // Realizar el juego 10 veces
        for (int i = 1; i <= 10; i++) {
            List<String> paises = new ArrayList<>(mapaPaisesCapitales.keySet());
            String paisAleatorio = paises.get(random.nextInt(paises.size()));
            String capitalCorrecta = mapaPaisesCapitales.get(paisAleatorio);

            System.out.println("Pregunta " + i + ": ¿Cuál es la capital de " + paisAleatorio + "?");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(capitalCorrecta)) {
                System.out.println("¡Correcto!");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta. La capital es " + capitalCorrecta);
            }
        }

        // Guardar la puntuación en el archivo clasificacion.txt
        try {
            FileWriter fw = new FileWriter("clasificacion.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombreUsuario + ": " + puntuacion + " puntos");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del juego. Tu puntuación es: " + puntuacion);
        scanner.close();
    }
}

