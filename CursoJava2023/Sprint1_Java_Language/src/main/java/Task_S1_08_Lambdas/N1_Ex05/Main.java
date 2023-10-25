package Task_S1_08_Lambdas.N1_Ex05;

public class Main {
    public static void main(String[] args) {
        IPiValueProvider piProvider = IPiValueProvider.of(3.1416);

        double pi = piProvider.getPiValue();
        System.out.println("The pi value is: " + pi);

    }
}


