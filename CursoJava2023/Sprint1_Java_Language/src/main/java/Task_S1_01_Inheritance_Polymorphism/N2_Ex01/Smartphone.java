package Task_S1_01_Inheritance_Polymorphism.N2_Ex01;

public class Smartphone extends Telefono implements ICamara, IReloj {

    public int numTelefono;
    public Smartphone() {
    }
    public Smartphone(String marca, String modelo, int numTelefono) {
        super(marca, modelo);
        this.numTelefono = numTelefono;
    }
    public int getNumTelefono() {

        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {

        this.numTelefono = numTelefono;
    }

    @Override
    public void llamar() {

        System.out.println("Estas llamando al telefono " + numTelefono);
    }

    @Override
    public void fotografiar() {

        System.out.println("Se esta haciendo una foto.");
    }

    @Override
    public void alarma() {

        System.out.println("Esta sonando la alarma.");
    }
}

