package Task_S1_06_Generics.N1_Ex02;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("John", "Doe", 30);
        String saludo = "Hola";
        int numero = 42;

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.imprimirArgumentos(persona, saludo, numero);
        genericMethods.imprimirArgumentos(numero, persona, saludo);
        genericMethods.imprimirArgumentos(saludo, numero, persona);
    }
}