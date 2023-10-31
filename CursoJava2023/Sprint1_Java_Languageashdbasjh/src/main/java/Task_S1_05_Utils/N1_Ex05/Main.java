package Task_S1_05_Utils.N1_Ex05;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        SerializableObject obj = new SerializableObject("Hola soy Santiago!");
        String filePath = "serializedObject.ser";

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath)) ) {
            outputStream.writeObject(obj);
            System.out.println("Objeto serializado y guardado en " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerializableObject deserializedObj = null;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath)) ) {
            deserializedObj = (SerializableObject) inputStream.readObject();
            System.out.println("Objeto deserializado: " + deserializedObj.getData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

