package Task_S1_04_Testing.N1_Ex03;

public class EjemploMonthException {

    public void throwException(int index) {
        int[] array = {1,2,3,4,5};

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
            throw  e;
        }
    }
}
