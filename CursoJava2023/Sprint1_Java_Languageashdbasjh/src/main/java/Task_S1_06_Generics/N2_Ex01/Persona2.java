package Task_S1_06_Generics.N2_Ex01;

public class Persona2 {
    String nombre;
    String apellido;
    int edad;

    public Persona2(String nombre, String apellido, int edad) {
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
