package Task_S1_04_Testing.N1_Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class Main_ArrayIndexOutOfBoundsExceptionTest {
    @Test
    public void testThrowException() {
        Main_ArrayIndexOutOfBoundsException arrayException = new Main_ArrayIndexOutOfBoundsException();
        int invalidIndex = 9;

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayException.throwException(invalidIndex));
    }
}
