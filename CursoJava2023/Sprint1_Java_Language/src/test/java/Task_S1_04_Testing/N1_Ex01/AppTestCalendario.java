package Task_S1_04_Testing.N1_Ex01;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTestCalendario {

    @Test
    public void calendario() {

        List<String> calendario = new ArrayList<>();
        calendario.add("Enero");
        calendario.add("Febrero");
        calendario.add("Marzo");
        calendario.add("Abril");
        calendario.add("Mayo");
        calendario.add("Junio");
        calendario.add("Julio");
        calendario.add("Agosto");
        calendario.add("Setiembre");
        calendario.add("Octubre");
        calendario.add("Noviembre");
        calendario.add("Diciembre");

        assertEquals(12, calendario.size());

        assertNotNull(calendario);

        assertEquals("Agosto", calendario.get(7));
    }

}