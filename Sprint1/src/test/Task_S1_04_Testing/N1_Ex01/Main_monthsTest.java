package Task_S1_04_Testing.N1_Ex01;

import org.junit.jupiter.api.Test;

import static Task_S1_04_Testing.N1_Ex01.Main_months.months;
import static org.junit.jupiter.api.Assertions.*;

class Main_monthsTest {

    @Test
    void fillArray() {
    }

    @Test
    public void listSize() {

        int goal = 12;
        int result = Main_months.CreateArray().size();
        assertEquals(goal, result);
    }

    @Test
    public void controlArrayNotNull() {

        assertNotNull(months);
    }

    @Test
    public void controlMonthPosition() {
        String goal = "agosto";
        String result = Main_months.CreateArray().get(7);
        assertEquals(goal, result);
    }

}