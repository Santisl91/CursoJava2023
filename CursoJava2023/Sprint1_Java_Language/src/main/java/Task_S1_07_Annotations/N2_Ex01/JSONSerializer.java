package Task_S1_07_Annotations.N2_Ex01;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

class JSONSerializer {
    public void serializeToJson(Object obj, String identifier) throws IOException {
        Class<?> clazz = obj.getClass();
        JSONSerializable annotation = clazz.getAnnotation(JSONSerializable.class);

        if (annotation != null) {
            String directory = annotation.directory();
            String json = new Gson().toJson(obj);
            String fileName = directory + "/" + identifier + "_" + clazz.getSimpleName() + ".json";

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(json);
            }
        } else {
            throw new IllegalArgumentException("La clase no está marcada con @JSONSerializable");
        }
    }
}

