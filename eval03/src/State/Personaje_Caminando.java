package State;

public class Personaje_Caminando implements EstadoPersonaje {
    public void caminar() {
        System.out.println("El personaje está caminando.");
    }

    public void agacharse() {
        System.out.println("El personaje no puede agacharse mientras está caminando.");
    }

    public void levantarse() {
        System.out.println("El personaje ya está de pie mientras camina.");
    }
}
