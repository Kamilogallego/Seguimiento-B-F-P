package Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(false);

        Predicate<Semaforo> estaEncendido = Semaforo::isEncendido;
        if (estaEncendido.test(semaforo)) {
            System.out.println("El semáforo está encendido");
        } else {
            System.out.println("El semáforo está apagado");
        }
    }
}
