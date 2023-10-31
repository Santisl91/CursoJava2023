package Task_S1_01_Inheritance_Polymorphism.N2_Ex01;

public class Main {
    public static void main(String[] args) {

        Smartphone mobil = new Smartphone("Apple","iphone",602310088);
        mobil.llamar();

        mobil.setNumTelefono(900328920);

        mobil.llamar();
        mobil.fotografiar();
        mobil.alarma();
    }
}
