package Task_S1_02_Exceptions.N1_Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            try {
                Producto producto1 = new Producto("cafe", 20.5);
                Producto producto2 = new Producto("leche", 10.7);

                List<Producto> nuevaLista = new ArrayList<Producto>();

                Venta nuevaVenta = new Venta(nuevaLista, 0.0);

                nuevaVenta.calcularTotal();


            } catch (VentaBuidaException e) {
                System.out.println(e.getMessage());
            }

            try {
                int edades[] = {15, 20, 30, 13};
                System.out.println("La edad de la posicion 5 es: " + edades[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Asi se captura una excepcion tipo ArrayIndexOutOfBoundsException");
            }
        }
    }
