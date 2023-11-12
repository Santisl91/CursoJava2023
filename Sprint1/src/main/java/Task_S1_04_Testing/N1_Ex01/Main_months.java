package Task_S1_04_Testing.N1_Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_months {
    public static List<String> months = new ArrayList<String>();

    public static List<String> CreateArray() {

        months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"));

        return months;
    }

}
