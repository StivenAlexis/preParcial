package torneo;

public class Jugador {
    private String name;
    private int numeroCamiseta;

    public Jugador(String name, int numeroCamiseta) {
        this.name = name;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getName() {
        return name;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
}
