package colecciones;

import java.time.LocalDate;
import java.util.Date;

public class Magic implements Comparable<Magic>{
    int id;
    int rareza;
    int ataque;
    int defensa;
    String nombre;
    LocalDate fecha;

    public Magic(int id, int rareza, String nombre, int ataque, int defensa){
        if (rareza<0 || rareza>4)
            throw new IllegalArgumentException();
        this.id = id;
        this.rareza = rareza;
        this.nombre = nombre;

        this.ataque = ataque;
        this.defensa = defensa;

        this.fecha = LocalDate.now();
    }


    @Override
    public String toString() {
        return "Segell [id=" + id + ", rareza=" + rareza + ", nombre=" + nombre + ", ataque="+ataque+", defensa="+defensa+", fecha=" + fecha + "]";
    }

    @Override
    public int compareTo(Magic o) {
        if(this.nombre.compareTo(o.nombre) == 0)
            return this.rareza-o.rareza;
        else
            return this.nombre.compareTo(o.nombre);
    }
}
