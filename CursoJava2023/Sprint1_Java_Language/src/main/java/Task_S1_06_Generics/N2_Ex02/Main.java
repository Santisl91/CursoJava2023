package Task_S1_06_Generics.N2_Ex02;

public class Main {
    public static void main(String[] args) {

        Persona3 persona = new Persona3("Santi", "Santos", 32);
        String saludos = "Hola";
        int numero = 42;
        double altura = 1.78;
        boolean booleano = true;
        char caracter = 'A';

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.imprimirArgumentos(persona, saludos, numero, altura, booleano, caracter);
        genericMethods.imprimirArgumentos(saludos, numero, altura, booleano, caracter, persona);
    }
}
