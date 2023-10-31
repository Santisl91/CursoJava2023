package Task_S1_06_Generics.N2_Ex01;

public class GenMethNoGenMeth {
    public <T1> void imprimirArgumentos(T1 arg1, String arg2, int arg3) {
        System.out.println("Argumento 1:");
        System.out.println(arg1);

        System.out.println("Argumento 2:");
        System.out.println(arg2);

        System.out.println("Argumento 3:");
        System.out.println(arg3);
    }
}

