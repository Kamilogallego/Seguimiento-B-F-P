package Predicate;

public class Semaforo {
    private boolean encendido;

    public Semaforo(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
