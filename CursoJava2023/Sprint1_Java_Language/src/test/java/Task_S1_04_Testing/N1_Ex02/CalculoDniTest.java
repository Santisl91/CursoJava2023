package Task_S1_04_Testing.N1_Ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @Test
    public void testCalcularLetraDNI() {

        int[] numeroDNI = {345678567};

        char[] letraEsperada = {'K'};

        for (int i = 0; i < numeroDNI.length; i++) {
            char letraCalculada = CalculoDni.calcularLetrasDNI(numeroDNI[i]);
            assertEquals(letraEsperada[i], letraCalculada);
        }
    }
}