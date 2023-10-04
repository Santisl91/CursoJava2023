package Task_S1_02_Exceptions.N1_Ex01;

public class VentaBuidaException extends Exception{
    public VentaBuidaException() {

        super("Para hacer una venta primero debes añadir productos");
    }
}
