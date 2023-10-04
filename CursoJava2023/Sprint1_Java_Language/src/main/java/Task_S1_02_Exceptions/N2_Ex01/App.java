package Task_S1_02_Exceptions.N2_Ex01;

public class App {
    public static void main(String[] args) {
        byte edad = Input.leerByte("Introduce tu edad");
        int numeroEntero = Input.leerInt("Introduce un número entero");
        float numeroFloat = Input.leerFloat("Introduce un número decimal");
        double numeroDouble = Input.leerDouble("Introduce un número decimal");
        char letra = Input.leerChar("Introduce una letra");
        String nombre = Input.leerString("Introduce tu nombre");
        boolean respuesta = Input.leerSiNo("¿Quieres salir del programa?");

        System.out.println("Edad: " + edad);
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal (float): " + numeroFloat);
        System.out.println("Número decimal (double): " + numeroDouble);
        System.out.println("Letra: " + letra);
        System.out.println("Nombre: " + nombre);
        System.out.println("¿Quieres salir del programa? " + respuesta);
    }
}
