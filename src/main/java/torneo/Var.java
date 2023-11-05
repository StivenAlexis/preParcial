package torneo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {

    private Partido partido;
    private List<TarjetaBase> tarjetasRojas = new ArrayList<>();
    private List<TarjetaBase> tarjetasAmarillas = new ArrayList<>();

    public Var(Partido partido){
        this.partido = partido;

    }


    public Partido getPartido() {
        return partido;
    }


    public void setPartido(Partido partido) {
        this.partido = partido;
    }


    public int cantidadTarjetas(Equipo equipo) {
        int cantidad = 0; 
        for (int i = 0; i < equipo.getIjugadores().size(); i++) {
            for (TarjetaBase tarjetasJugadores : getPartido().getTarjetas()) {
            
                if(tarjetasJugadores.getIjugador()==equipo.getIjugadores().get(i)){
                    cantidad++;
                }
        }
    }
            
       return cantidad;
    }


    /* 
    public int cantidadTarjetas(Equipo equipo) {
        return (int) equipo.getIjugadores().stream()
                .mapToLong(jugador -> getPartido().getTarjetas().stream()
                    .filter(tarjeta -> tarjeta.getIjugador() == jugador)
                    .count())
                .sum();
    }
   */ 

    public int cantidadTarjetasRojas() {
        
        for (TarjetaBase tarjetaRoja : getPartido().getTarjetas()) {
            if (tarjetaRoja.getColor()=="ROJA"){

            tarjetasRojas.add(tarjetaRoja);
            }
        }

        return tarjetasRojas.size();
    }

    public int cantidadTarjetasAmarillas() {


        return (int) getPartido().getTarjetas().stream()
            .filter(tarjetaAmarilla -> tarjetaAmarilla.getColor().contains("AMARILLA"))
            .count();
    }
    
    

}
