package torneo;

import torneo.Interfaces.IImprimible;

public class Estadio
        implements IImprimible {
    
    private String nombre ="";
    private String ciudad ="";
    private String pais ="";

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Estadio(String nombre, String ciudad, String pais){
        setCiudad(ciudad);
        setName(nombre);
        setPais(pais);
    }
    
    @Override
    public String toString(){

        return getName()+", "+getCiudad()+" ("+getPais()+")";

    }

    
    public String impresion() {
        return "["+"Estadio"+"] "+ getName() + " ("+ getCiudad()+ " - "+getPais()+")";
    }
}
