package Task_S1_06_Generics.N1_Ex02;

public class GenericMethods {
    public <T1, T2, T3> void imprimirArgumentos(T1 arg1, T2 arg2, T3 arg3) {
        System.out.println("Argumento 1:");
        if (arg1 instanceof Persona) {
            Persona persona = (Persona) arg1;
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println(arg1.toString());
        }

        System.out.println("Argumento 2:");
        if (arg2 instanceof Persona) {
            Persona persona = (Persona) arg2;
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println(arg2.toString());
        }

        System.out.println("Argumento 3:");
        if (arg3 instanceof Persona) {
            Persona persona = (Persona) arg3;
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println(arg3.toString());
        }
    }
}

