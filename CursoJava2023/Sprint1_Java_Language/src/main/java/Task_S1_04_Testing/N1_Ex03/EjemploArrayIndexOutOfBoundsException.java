package Task_S1_04_Testing.N1_Ex03;

public class EjemploArrayIndexOutOfBoundsException {

    private int[] miArreglo;

    public EjemploArrayIndexOutOfBoundsException() {
        miArreglo = new int[5];
    }
    public void lanzarExcepcion() {
        int valor = miArreglo[5];
    }
}

