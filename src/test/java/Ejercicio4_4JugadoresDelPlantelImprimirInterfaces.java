import static org.junit.Assert.assertEquals;

import org.junit.Test;

import torneo.Equipo;
import torneo.Jugador;
import torneo.Interfaces.IJugador;

public class Ejercicio4_4JugadoresDelPlantelImprimirInterfaces {
     @Test
    public void equipo_plantel_parcial_ejercicio_ejemplo_09()
    {        
        String resultadoEsperado = "[6] Marcos Rojo (Defensor), [10] Edinson Cavani (Ataque), [19] Valentin Barco (Volante)";


        Equipo boca = new Equipo("Boca Juniorws", "BOC");          
       
       
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);
       
        //Agregamos en diferente al orden numerico de la camiseta
        boca.agregar(jugadorBoca6);        
        boca.agregar(jugadorBoca19);                  
        boca.agregar(jugadorBoca10);      
       
        jugadorBoca6.setPosicion("Defensor");        
        jugadorBoca10.setPosicion("Ataque");
        jugadorBoca19.setPosicion("Volante");
       
        assertEquals(resultadoEsperado, boca.imprimirPlantel());


    }

}
