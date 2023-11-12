package Task_S1_04_Testing.N1_Ex02;

public class CalculoDni {
    int dniNumber;

    public CalculoDni(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public int getDniNumber() {
        return dniNumber;
    }

    public static char calcularLetrasDNI(int dniNumber) {

        char[] dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

        int indice = dniNumber % 23;
        return dniLetters[indice];
    }
}
