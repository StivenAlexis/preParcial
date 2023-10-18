package torneo;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    private String nombre;
    
    public String getNombre() {
        return nombre+" "+equipoLocal.getAbreviatura()+"x"+equipoVisitante.getAbreviatura();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private List<Tarjeta> tarjetas = new ArrayList<>();

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        setEquipoLocal(equipoLocal);
        setEquipoVisitante(equipoVisitante);
        setNombre(nombre);
    }

    public void agregar(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad() {
        return tarjetas.size();
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }



}