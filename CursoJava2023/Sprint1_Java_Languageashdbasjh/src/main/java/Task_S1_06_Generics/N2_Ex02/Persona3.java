package Task_S1_06_Generics.N2_Ex02;

public class Persona3 {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona3(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}

