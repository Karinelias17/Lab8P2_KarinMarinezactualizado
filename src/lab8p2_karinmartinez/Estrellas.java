
package lab8p2_karinmartinez;

import java.io.Serializable;

public class Estrellas implements Serializable{
    public String nombre, descripcion;
    public int distancia;

    public Estrellas()  {
    }

    public Estrellas(String nombre, String descripcion, int distancia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Estrellas{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", distancia=" + distancia + '}';
    }
    
    
}
