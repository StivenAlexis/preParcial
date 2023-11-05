package torneo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import torneo.Interfaces.IImprimible;
import torneo.Interfaces.IJugador;

public class Equipo
        implements IImprimible {
    private String name;
    private String abreviatura;
    private List<Jugador> jugadores = new ArrayList<>();
    private List<IJugador> Ijugadores = new ArrayList<>();


    public List<IJugador> getIjugadores() {
        return Ijugadores;
    }

    public void setIjugadores(List<IJugador> ijugadores) {
        Ijugadores = ijugadores;
    }

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

    public void agregar(IJugador jugador) {
        Ijugadores.add(jugador);
    }

    public int jugadoresCantidad() {
        return getJugadores().size();
    }

    public Jugador obtenerJugador(int numeroCamiseta) {
        for (Jugador jugador : getJugadores()) {
            if (jugador.getNumero() == numeroCamiseta) {
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

    public String imprimirPlantel(){
        String resultado="";
        List<IJugador> jugadoresOrdenados = Ijugadores.stream()
                .sorted((jugador1, jugador2) -> Integer.compare(jugador1.getNumero(), jugador2.getNumero()))
                .collect(Collectors.toList());

        for (IJugador iJugador : jugadoresOrdenados) {
            
            if (resultado!=""){

                resultado +=","+" ["+iJugador.getNumero()+"] "+iJugador.getName() + " ("+iJugador.getPosicion()+")";

            }else{
                resultado += "["+iJugador.getNumero()+"] "+iJugador.getName() + " ("+iJugador.getPosicion()+")";
            }
            
        }
        
    return resultado; 

        }

        
    public String impresion() {
        
            return "["+"Equipo"+"] "+getName() + " > "+ getAbreviatura();
        
    }

}
    

     
       


