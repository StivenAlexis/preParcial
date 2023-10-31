package torneo;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String nombre;
    private Estadio estadio;
    private Arbitro arbitro;
    private Arbitro arbitroAsistente;
    private List<Arbitro> arbitroLinea = new ArrayList<>();
    private List<TarjetaBase> tarjetas = new ArrayList<>();

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        setEquipoLocal(equipoLocal);
        setEquipoVisitante(equipoVisitante);
        setNombre(nombre);
    }

    public Partido(Estadio estadio, Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        setEstadio(estadio);
        setEquipoLocal(equipoLocal);
        setEquipoVisitante(equipoVisitante);
        setNombre(nombre);
    }

    public void agregar(TarjetaBase tarjeta) {
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad() {
        return tarjetas.size();
    }

    public List<TarjetaBase> getTarjetas() {
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

    public String getName() {
        return nombre+" "+equipoLocal.getAbreviatura()+"x"+equipoVisitante.getAbreviatura();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Arbitro getArbitroAsistente() {
        return arbitroAsistente;
    }

    public void setArbitroAsistente(Arbitro arbitroAsistente) {
        this.arbitroAsistente = arbitroAsistente;
    }

    public List<Arbitro> getArbitroLinea() {
        return arbitroLinea;
    }

    public void setArbitroLinea(List<Arbitro> arbitroLinea) {
        this.arbitroLinea = arbitroLinea;
    }


}