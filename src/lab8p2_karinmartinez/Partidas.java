
package lab8p2_karinmartinez;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Partidas implements Serializable{
    public String nombre;
    public Date fecha;
    public ArrayList <Estrellas> estrellas=new ArrayList();
    public ArrayList <Jugadores> jugadores=new ArrayList();
    public File archivo = null;

    private static final long SerialVersionUID=777L;
    
    public Partidas() {
    }

    public Partidas(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estrellas> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrellas> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void addJugadores(Jugadores jugador) {
        jugadores.add(jugador);
    }
    
    public void addEstrellas(Estrellas estrella) {
        estrellas.add(estrella);
    }

    @Override
    public String toString() {
        return "Partidas{" + "nombre=" + nombre + ", fecha=" + fecha + ", estrellas=" + estrellas + '}';
    }
    
    
}
