package torneo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String name;
    private String abreviatura;
    private List<Jugador> jugadores = new ArrayList<>();


    public Equipo(String name, String abreviatura) {
        setName(name);
        setAbreviatura(abreviatura);
    }

    public String getName() {
        return name;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }    

    public int jugadoresCantidad() {
        return getJugadores().size();
    }

    public Jugador obtenerJugador(int numeroCamiseta) {
        for (Jugador jugador : getJugadores()) {
            if (jugador.getNumeroCamiseta() == numeroCamiseta) {
                return jugador;
            }
        }
        return null; // Devuelve null si no se encuentra el jugador
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
     
    public void setName(String name) {
        this.name = name;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }



}

