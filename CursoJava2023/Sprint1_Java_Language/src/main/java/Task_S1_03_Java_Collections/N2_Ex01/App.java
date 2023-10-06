package Task_S1_03_Java_Collections.N2_Ex01;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        HashSet<Restaurant> puntuacionRestaurantes = new HashSet<>();

        puntuacionRestaurantes.add(new Restaurant("Chivous",1));
        puntuacionRestaurantes.add(new Restaurant("Chivou",2));
        puntuacionRestaurantes.add(new Restaurant("Chivous",3));
        puntuacionRestaurantes.add(new Restaurant("Chivous",2));

        for(Restaurant restaurante : puntuacionRestaurantes) {
            System.out.println("Nombre: " + restaurante.getNombre() + " Puntuacion: " + restaurante.getPuntuacion());

        }
    }
}
