package torneo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    
    private List<Equipo> equipos = new ArrayList<>();
    private List<Partido> partidos = new ArrayList();



    public Torneo(String nombre) {
        setNombre(nombre);
    }

    public void agregar(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregar(Partido partido) {
        partidos.add(partido);
    }

    public int equiposCantidad() {
        return equipos.size();
    }

    public int partidosCantidad() {
        return partidos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}