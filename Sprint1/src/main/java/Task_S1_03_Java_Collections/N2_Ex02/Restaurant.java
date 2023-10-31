package Task_S1_03_Java_Collections.N2_Ex02;

public class Restaurant implements Comparable<Restaurant> {
    String nombre;
    int puntuacion;

    public Restaurant(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant otroRestaurante = (Restaurant) obj;
        return nombre.equals(otroRestaurante.nombre) && puntuacion == otroRestaurante.puntuacion;
    }

    @Override
    public int compareTo(Restaurant otroRestaurante) {

        int comparacionNombre = this.nombre.compareTo(otroRestaurante.getNombre());
        if (comparacionNombre != 0){
            return comparacionNombre;
        }
        return Integer.compare(this.puntuacion, otroRestaurante.puntuacion);
    }
}
