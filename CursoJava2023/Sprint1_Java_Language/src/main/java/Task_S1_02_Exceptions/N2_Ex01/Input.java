package Task_S1_02_Exceptions.N2_Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static byte leerByte(String mensaje) {
        byte valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje + ":");
                valor = scanner.nextByte();
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Ingresa un valor decimal valido.");
                scanner.nextLine();
            }

        } while (!entradaValida) ;

        return valor;
    }
    public static int leerInt(String mensaje){
        int valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje + ":");
                valor = scanner.nextInt();
                entradaValida = true;

            } catch (InputMismatchException e){
                System.out.println("Error de formato. Ingresa un valor decimal valido.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        return valor;
    }
    public static float leerFloat(String mensaje){
        float valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje + ":");
                valor = scanner.nextFloat();
                entradaValida = true;
            } catch (InputMismatchException e){
                System.out.println("Error de formato. Ingresa un valor decimal valido.");
            }

        } while (!entradaValida);

        return valor;
    }
    public static double leerDouble(String mensaje){
        double valor = 0.0;
        boolean entradaValida = false;

        do {
            try {
                System.out.println(mensaje + ":");
                valor = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e){
                System.out.println("Error de formato. Ingresa un valor decimal valido.");
            }

        } while (!entradaValida);

        return valor;

    }
    public static char leerChar(String mensaje) {
        char valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje + ": ");
                String input = scanner.next();
                if (input.length() == 1) {
                    valor = input.charAt(0);
                    entradaValida = true;
                } else {
                    System.out.println("Error. Ingresa un solo carácter.");
                }
            } catch (Exception e) {
                System.out.println("Error de entrada. Ingresa un carácter válido.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        return valor;
    }

    public static String leerString(String mensaje) {
        String valor = "";
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje + ": ");
                valor = scanner.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error de entrada. Ingresa solo letras.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        return valor;
    }

    public static boolean leerSiNo(String mensaje) {
        boolean respuesta = false;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje + " (s/n): ");
                String input = scanner.next().toLowerCase();
                if (input.equals("s")) {
                    respuesta = true;
                    entradaValida = true;
                } else if (input.equals("n")) {
                    respuesta = false;
                    entradaValida = true;
                } else {
                    System.out.println("Error. Ingresa 's' o 'n'.");
                }
            } catch (Exception e) {
                System.out.println("Error de entrada. Ingresa 's' o 'n'.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        return respuesta;
    }

}