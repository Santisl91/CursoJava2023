package Task_S1_04_Testing.N1_Ex01;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main{

    public void testListaMeses() {

        List<String> mesesDelAnio = new ArrayList<>();
        mesesDelAnio.add("Enero");
        mesesDelAnio.add("Febrero");
        mesesDelAnio.add("Marzo");
        mesesDelAnio.add("Abril");
        mesesDelAnio.add("Mayo");
        mesesDelAnio.add("Junio");
        mesesDelAnio.add("Julio");
        mesesDelAnio.add("Agosto");
        mesesDelAnio.add("Setiembre");
        mesesDelAnio.add("Octubre");
        mesesDelAnio.add("Noviembre");
        mesesDelAnio.add("Diciembre");

        assertEquals(12, mesesDelAnio.size());

        assertNotNull(mesesDelAnio);

        assertEquals("Agosto", mesesDelAnio.get(7));
    }
}
