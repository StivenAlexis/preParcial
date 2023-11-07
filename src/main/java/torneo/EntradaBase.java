package torneo;

public abstract class EntradaBase {
    
    private Partido partido;
    private String nombre;
    private int numero;
    



    public Partido getPartido() {
        return partido;
    }




    public void setPartido(Partido partido) {
        this.partido = partido;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public int getNumero() {
        return numero;
    }




    public void setNumero(int numero) {
        this.numero = numero;
    }




    public EntradaBase(Partido partido, String string, int i) {
        setPartido(partido);
        setNombre(string);
        setNumero(i);

    }
}