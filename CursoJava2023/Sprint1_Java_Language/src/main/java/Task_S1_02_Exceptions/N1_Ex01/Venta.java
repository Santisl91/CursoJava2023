package Task_S1_02_Exceptions.N1_Ex01;

import java.util.List;

public class Venta{
    private List<Producto> productoList;
    private double precioTotal;

    public Venta(List<Producto> productoList, double precioTotal) {
        this.productoList = productoList;
        this.precioTotal = precioTotal;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setProductoList(List<Producto> productoList) {

        this.productoList = productoList;
    }

    public void setPrecioTotal(double precioTotal) {

        this.precioTotal = precioTotal;
    }
    public void calcularTotal() throws VentaBuidaException{
        if (productoList.isEmpty()) {
            throw new VentaBuidaException();
        }
        for (Producto producto:productoList){
            precioTotal += producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Venta{" +
                "productoList=" + productoList +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
