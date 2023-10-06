package Task_S1_04_Testing.N1_Ex02;

public class CalculoDni {
    int numeroDni;

    public CalculoDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public static char calcularLetrasDNI(int numeroDNI) {

        char[] letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

        int indice = numeroDNI % 23;
        return letrasDni[indice];
    }
}
