package Task_S1_08_Lambdas.N1_Ex08;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {

        IStringProvider reverser = (chain) -> {
            StringBuilder reversed = new StringBuilder(chain).reverse();
            return reversed.toString();
        };

        String inputString = "Soy Santiago Santos";

        String reversedString = reverser.reverse(inputString);

        System.out.println("Original string chain: " + inputString);
        System.out.println("Reversed string chain: " + reversedString);
    }
}
