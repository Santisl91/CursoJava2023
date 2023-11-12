package Task_S1_04_Testing.N1_Ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main_ListDNITest {
    @Test
    public void testCalcularLetraDNI() {

        int[] numeroDNI = {345678567, 123234345, 345456567, 321432543, 654765876, 987876765, 456765345, 543456543,
                334455334, 222333444};

        char[] letraEsperada = {'K', 'T', 'V', 'E', 'J', 'Q', 'L', 'P', 'Y', 'B'};

        for (int i = 0; i < numeroDNI.length; i++) {
            char letraCalculada = CalculoDni.calcularLetrasDNI(numeroDNI[i]);
            assertEquals(letraEsperada[i], letraCalculada);
        }
    }
}