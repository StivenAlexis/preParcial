package torneo;

import java.util.ArrayList;
import java.util.List;


public class Var {

    private Partido partido;
    private List<TarjetaBase> tarjetasRojas = new ArrayList<>();
    private List<TarjetaBase> tarjetasAmarillas = new ArrayList<>();
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVar> avars = new ArrayList<>();
  

    public Var(Partido partido){
        this.partido = partido;

    }

    public Var(Partido partido, AsistenteDeVideo AsistenteV, List<AVar> Avars) {
        if (Avars.size() > 3) {
            throw new IllegalArgumentException("La lista de Asistentes del vare no puede contener más de 3 Asistentes ");
        }
    
        this.partido = partido;
        this.asistenteDeVideo = AsistenteV;
        this.avars = Avars;
    }
    

//getter and setter inicio
    public Partido getPartido() {
        return partido;
    }


    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public List<TarjetaBase> getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }


    public void setTarjetasAmarillas(List<TarjetaBase> tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return asistenteDeVideo;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }


    public List<AVar> getAvars() {
        return avars;
    }

    public void setAvars(List<AVar> avars) {
        this.avars = avars;
    }


//getter and setter fin

//funciones inicio
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
    
//funciones fin    

}
