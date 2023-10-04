package Task_S1_01_Inheritance_Polymorphism.N1_Ex02;

public class App {
    public static void main(String[] args) {

        Coche miCoche = new Coche(2000);

        System.out.println("La marca de mi coche es: " + Coche.marca);
        System.out.println("El modelo de mi coche es: " + Coche.modelo);
        System.out.println("La potencia de mi coche es: " + miCoche.potencia + " HP");
        Coche.frenar();
        miCoche.acelerar();
    }
}
