package Task_S1_01_Inheritance_Polymorphism.N1_Ex02;

public class Coche {
    public static final String marca = "Ford";
    public static String modelo = "camaro";
    public final double potencia;

    public Coche(double potencia) {

        this.potencia = potencia;
    }
    public String getMarca() {

        return marca;
    }
    public String getModelo() {

        return modelo;
    }
    public double getPotencia() {

        return potencia;
    }
    public void setModelo(String modelo) {

        Coche.modelo = modelo;
    }
    public static void frenar() {

        System.out.println("El vehiculo esta frenando");
    }
    public void acelerar(){

        System.out.println("El vehiculo esta acelerando");
    }
}
