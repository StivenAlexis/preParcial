import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Assert.*;
import org.junit.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import torneo.AVar;
import torneo.Arbitro;
import torneo.AsistenteDeVideo;
import torneo.Equipo;
import torneo.Estadio;
import torneo.Partido;
import torneo.Var;


public class Ejercicio4_7ArbitrosYEquipoDelVAR {
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testConstructorPartidoConArbitrosLineaValidos() {
        Arbitro arbitro = new Arbitro();
        Arbitro arbitroAsistente = new Arbitro();
        Arbitro arbitroLinea1 = new Arbitro();
        Arbitro arbitroLinea2 = new Arbitro();
        Estadio estadio = new Estadio("camp nou", "barcelona", "España");
        Equipo equipoLocal = new Equipo("losrayosfc", "Ray");
        Equipo equipoVisitante = new Equipo("lostruenosfc", "Tru");
        String nombre = "Partido de prueba";

        // Crear una lista de árbitros de línea válida (menos de 3)
        List<Arbitro> arbitrosLinea = Arrays.asList(arbitroLinea1, arbitroLinea2);

        // Intentar crear un partido con árbitros de línea válidos
        Partido partido = new Partido(arbitro, arbitroAsistente, arbitrosLinea, estadio, equipoLocal, equipoVisitante, nombre);

        // Verificar que el partido se ha creado correctamente
        assertNotNull(partido);
    }

    
    
    @Test
    public void testConstructorPartidoConMasDeDosArbitrosLinea() {

        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Este campo es obligatorio");

        Arbitro arbitro = new Arbitro();
        Arbitro arbitroAsistente = new Arbitro();
        Arbitro arbitroLinea1 = new Arbitro();
        Arbitro arbitroLinea2 = new Arbitro();
        Arbitro arbitroLinea3 = new Arbitro(); // Más de dos árbitros de línea
        Estadio estadio = new Estadio("camp nou", "barcelona", "España");
        Equipo equipoLocal = new Equipo("losrayosfc", "Ray");
        Equipo equipoVisitante = new Equipo("lostruenosfc", "Tru");
        String nombre = "Partido de prueba";

        // Crear una lista de árbitros de línea con más de 2 árbitros
        List<Arbitro> arbitrosLinea = new ArrayList<>() ;

        arbitrosLinea.add(arbitroLinea1);
        arbitrosLinea.add(arbitroLinea2);
        arbitrosLinea.add(arbitroLinea3);
        

        Partido partido = new Partido(arbitro, arbitroAsistente, arbitrosLinea, estadio, equipoLocal, equipoVisitante, nombre);

        assertNotNull(partido);
        assertEquals(3,arbitrosLinea.size());
    }

 
    @Test
    public void testConstructorVarConMasDe3AsistentesDeVar() {
        
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Este campo es obligatorio");

        Arbitro arbitro = new Arbitro();
        Arbitro arbitroAsistente = new Arbitro();
        Arbitro arbitroLinea1 = new Arbitro();
        Arbitro arbitroLinea2 = new Arbitro();
        
        Estadio estadio = new Estadio("camp nou", "barcelona", "España");
        Equipo equipoLocal = new Equipo("losrayosfc", "Ray");
        Equipo equipoVisitante = new Equipo("lostruenosfc", "Tru");
        String nombre = "Partido de prueba";

        // Crear una lista de árbitros de línea con más de 2 árbitros
        List<Arbitro> arbitrosLinea = new ArrayList<>() ;

        arbitrosLinea.add(arbitroLinea1);
        arbitrosLinea.add(arbitroLinea2);

        Partido partido = new Partido(arbitro, arbitroAsistente, arbitrosLinea, estadio, equipoLocal, equipoVisitante, nombre);

        AsistenteDeVideo asistente1 = new AsistenteDeVideo();
        AVar avar = new AVar();
        AVar avar2 = new AVar();
        AVar avar3 = new AVar();
        AVar avar4 = new AVar();

       List<AVar> Avares = Arrays.asList(avar, avar2,avar3, avar4);


        Var var = new Var(partido,asistente1, Avares);
        
        assertNotNull(var);


    }

}
