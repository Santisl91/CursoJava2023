package Task_S1_01_Inheritance_Polymorphism.N1_Ex01;

public class Percusion extends Instrumento {
    public Percusion() {
    }
    public Percusion(String nombre, double precio) {

        super(nombre, precio);
    }
    @Override
    protected void tocar() {

        System.out.println("Está sonanado un instrumento de percusion");
    }

}

