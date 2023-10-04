package Task_S1_02_Exceptions.N1_Ex01;

public class Producto {
    String nombre;
    double precio;

    public Producto(){
    }
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {

        return nombre;
    }
    public double getPrecio() {

        return precio;
    }
    public  void setNombre(String nombre){

        this.nombre = nombre;
    }
    public void setPrecio(double precio){

        this.precio= precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
