package Task_S1_06_Generics.N2_Ex02;

public class GenericMethods {
    public GenericMethods() {
    }

    public <T> void imprimirArgumentos(T... args) {
        int argumentNumber = 1;

        for (T arg : args) {
            System.out.println("Argumento " + argumentNumber + ":");
            System.out.println(arg);
            argumentNumber++;
        }
    }
}

