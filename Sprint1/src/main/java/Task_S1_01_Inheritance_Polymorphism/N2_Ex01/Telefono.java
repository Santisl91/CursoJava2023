package Task_S1_01_Inheritance_Polymorphism.N2_Ex01;

public abstract class Telefono {

    protected String marca;
    protected String modelo;

    public Telefono() {
    }
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public abstract void llamar();


}
