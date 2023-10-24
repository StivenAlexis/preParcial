package torneo;

import torneo.Interfaces.IJugador;

public class PantallaLed {

    public String imprimir(IJugador jugador) {
        return "["+"Jugador "+jugador.getNumero()+"] "+jugador.getName()+" > " + jugador.getPosicion();
    }

    public String imprimir(Equipo equipo) {
        return "["+"Equipo"+"] "+equipo.getName() + " > "+ equipo.getAbreviatura();
    }

    public String imprimir(Estadio estadio) {
        return "["+"Estadio"+"] "+ estadio.getName() + " ("+ estadio.getCiudad()+ " - "+estadio.getPais()+")";
    }


}
