import static org.junit.Assert.assertEquals;

import org.junit.Test;

import torneo.Equipo;
import torneo.Estadio;
import torneo.Jugador;
import torneo.PantallaLed;
import torneo.Interfaces.IImprimible;
import torneo.Interfaces.IJugador;

public class Ejercicio4_6pantallasLed {

    @Test
    public void pantallas_estadio_parcial_ejercicio_ejemplo_10()
    {        
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        jugadorBoca6.setPosicion("Defensor");


        Equipo boca = new Equipo("Boca Juniors", "BOC");          
     
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       


        PantallaLed pantallaLed = new PantallaLed();


       
        assertEquals("[Jugador 6] Marcos Rojo > Defensor", pantallaLed.imprimir( (IImprimible) jugadorBoca6));        
        assertEquals("[Equipo] Boca Juniors > BOC", pantallaLed.imprimir((IImprimible) boca));
        assertEquals("[Estadio] La Bombonera (Buenos Aires - Argentina)", pantallaLed.imprimir((IImprimible)estadioBombonera));






    }

}
