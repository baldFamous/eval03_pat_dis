package Decorator;

public abstract class ArmaBase implements ArmaFuego {
    // Implementación común de los métodos
    public void sonido() {
        // Implementación común para todas las armas
        System.out.println("Haciendo sonido...");
    }

    public int balas() {
        // Implementación común para todas las armas
        return 0;
    }
}