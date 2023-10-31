package Task_S1_07_Annotations.N2_Ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JSONSerializer serializer = new JSONSerializer();
        Person person = new Person("Santi", 32);
        Person person1 = new Person("Rogelio", 89);
        Person person2 = new Person("Pedro", 76);

        try {
            serializer.serializeToJson(person, "Santi");
            serializer.serializeToJson(person1, "Rogelio");
            serializer.serializeToJson(person2, "Pedro");
            System.out.println("Objeto serializado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
