package Task_S1_04_Testing.N1_Ex02;

public class App {
    public static void main(String[] args) {

        CalculoDni numDNI = new CalculoDni(345678567);
        char letraDNI = CalculoDni.calcularLetrasDNI(numDNI.getNumeroDni());

        System.out.println("la letra del DNI " + numDNI + " es:" + letraDNI);
    }
}
