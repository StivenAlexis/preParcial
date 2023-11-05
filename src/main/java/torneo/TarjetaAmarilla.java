package torneo;

import torneo.Interfaces.IJugador;

public class TarjetaAmarilla 
    extends TarjetaBase{

    public TarjetaAmarilla( Jugador jugador) {
        super("AMARILLA", jugador);
       
    }

    public TarjetaAmarilla(IJugador ijugador) {
        super("ROJA", ijugador);
        
    }


}
