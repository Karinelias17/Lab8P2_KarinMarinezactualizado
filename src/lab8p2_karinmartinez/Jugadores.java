
package lab8p2_karinmartinez;

import java.io.Serializable;

public class Jugadores implements Serializable{
    public String nombre;
    public int velocidad;

    public Jugadores() {
    }

    public Jugadores(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", velocidad=" + velocidad + '}';
    }
    
    
}
