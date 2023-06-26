package State;

public class Personaje_Recostado implements EstadoPersonaje {
    public void caminar() {
        System.out.println("El personaje no puede caminar mientras está recostado.");
    }

    public void agacharse() {
        System.out.println("El personaje se agacha mientras está recostado.");
    }

    public void levantarse() {
        System.out.println("El personaje se levanta desde la posición recostada.");
    }
}
