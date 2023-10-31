package Task_S1_03_Java_Collections.N2_Ex01;

import java.util.Objects;

public class Restaurant {
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
}
