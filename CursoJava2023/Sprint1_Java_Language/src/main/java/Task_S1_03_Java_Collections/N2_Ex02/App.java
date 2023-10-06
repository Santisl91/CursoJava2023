package Task_S1_03_Java_Collections.N2_Ex02;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<Restaurant> puntuacionRestaurantes = new TreeSet<>();

        puntuacionRestaurantes.add(new Restaurant("KFC",1));
        puntuacionRestaurantes.add(new Restaurant("Chivous", 2));
        puntuacionRestaurantes.add(new Restaurant("Cheester", 2));
        puntuacionRestaurantes.add(new Restaurant("Angus", 3));

        for (Restaurant restaurante : puntuacionRestaurantes){
            System.out.println("Nombre: " + restaurante.getNombre() + " Puntuacion: " + restaurante.getPuntuacion());
        }
    }
}
