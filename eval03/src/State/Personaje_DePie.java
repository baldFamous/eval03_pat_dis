package State;

public class Personaje_DePie implements EstadoPersonaje {
    public void caminar() {
        System.out.println("El personaje comienza a caminar.");
    }

    public void agacharse() {
        System.out.println("El personaje se agacha desde la posición de pie.");
    }

    public void levantarse() {
        System.out.println("El personaje ya está de pie.");
    }
}
