package torneo;

import torneo.Interfaces.IJugador;

public class Jugador 
    implements IJugador{
    private String name;
    private String posicion;
   

    private int numero;

    public Jugador(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

     public void setName(String name) {
        this.name = name;
    }

    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


}
