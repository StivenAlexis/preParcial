package torneo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String nombre;
    private Estadio estadio;
    private Arbitro arbitro;
    private Arbitro arbitroAsistente;
    private List<Arbitro> arbitroLinea = new ArrayList<>();
    private List<TarjetaBase> tarjetas = new ArrayList<>();
    private Date fecha;
    private DateFormat fechaFormateada = new SimpleDateFormat("dd/M/yyyy");

  
   
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

    public Partido(Arbitro arbitro,Arbitro arbitroAsistente, List<Arbitro> arbitrosLinea,  Estadio estadio, Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        if(arbitrosLinea.size()>2 || arbitro==null || arbitroAsistente==null || estadio==null || equipoLocal==null || equipoVisitante==null){
           throw new IllegalArgumentException("Este campo es obligatorio");
        }else{
        setArbitro(arbitro);
        setArbitroAsistente(arbitroAsistente);
        setArbitroLinea(arbitrosLinea);
        setEstadio(estadio);
        setEquipoLocal(equipoLocal);
        setEquipoVisitante(equipoVisitante);
        setNombre(nombre);
        }
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

     public String getFechaFormateada() {
        return fechaFormateada.format(fecha);
    }

    public void setFechaFormateada(DateFormat fehcaFormateada) {
        this.fechaFormateada = fehcaFormateada;
    }


}