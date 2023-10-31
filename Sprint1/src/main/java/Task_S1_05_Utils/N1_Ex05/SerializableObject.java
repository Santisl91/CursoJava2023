package Task_S1_05_Utils.N1_Ex05;

import java.io.Serializable;

public class SerializableObject implements Serializable {
    private String data;

    public SerializableObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}


