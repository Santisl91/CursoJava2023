package Task_S1_01_Inheritance_Polymorphism.N1_Ex01;

public class Viento extends Instrumento{
    public Viento() {
    }
    public Viento(String nombre, double precio) {

        super(nombre, precio);
    }

    @Override
    protected void tocar() {

        System.out.println("Está sonanado un instrument de viento");
    }

}
