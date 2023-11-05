package torneo;

import java.util.ArrayList;
import java.util.List;

import torneo.Interfaces.IJugador;

public abstract class TarjetaBase{


    private String color;
    private Jugador jugador;
    private IJugador ijugador;
    private List<Equipo> equiposConTarjetas = new ArrayList<>();
    
   
   

    public TarjetaBase(String color, Jugador jugador) {
        setColor(color);
        setJugador(jugador);
    }

    public TarjetaBase(String color, IJugador ijugador) {
        setColor(color);
        setIjugador(ijugador);
    }

    public String getColor() {
        return color;
    }
   
    public void setColor(String value) {
        this.color = value;
    }


    public Jugador getJugador() {
        return jugador;
    }


    private void setJugador(Jugador value) {
        this.jugador = value;
    }

    
    public IJugador getIjugador() {
        return ijugador;
    }

    public void setIjugador(IJugador ijugador) {
        this.ijugador = ijugador;
    }
    
    public List<Equipo> getEquiposConTarjetas() {
        return equiposConTarjetas;
    }

    public void setEquiposConTarjetas(List<Equipo> equiposConTarjetas) {
        this.equiposConTarjetas = equiposConTarjetas;
    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }

    
}
