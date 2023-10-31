package Task_S1_06_Generics.N1_Ex01;

public class MainPrueba {
    public static void main(String[] args) {

        String nombre = "Santi";
        Integer edad = 32;
        Double altura = 1.78;

        NoGenericMethods container = new NoGenericMethods(altura, edad, nombre);

        Object obj1 = container.getObject1();
        Object obj2 = container.getObject2();
        Object obj3 = container.getObject3();

        System.out.println("Objeto 1: " + obj1);
        System.out.println("Objeto 2: " + obj2);
        System.out.println("Objeto 3: " + obj3);
    }
}
