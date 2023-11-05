package torneo;

import torneo.Interfaces.IJugador;

public class TarjetaRoja
    
    extends TarjetaBase {

    public TarjetaRoja(Jugador jugador) {
        super("ROJA", jugador);
        
    }

    public TarjetaRoja(IJugador ijugador) {
        super("ROJA", ijugador);
        
    }

   
    
}
