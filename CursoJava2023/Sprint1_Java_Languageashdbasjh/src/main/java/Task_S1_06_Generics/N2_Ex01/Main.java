package Task_S1_06_Generics.N2_Ex01;

public class Main {
        public static void main(String[] args) {
            Persona2 persona = new Persona2("Santi", "Santos", 32);
            String saludo = "Hola";
            int numero = 42;

            GenMethNoGenMeth genericMethods = new GenMethNoGenMeth();
            genericMethods.imprimirArgumentos(persona, saludo, numero);
            genericMethods.imprimirArgumentos(saludo, "Buenos dias", numero);
        }
    }
