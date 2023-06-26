package State;

// Contexto
public class Personaje {
    private EstadoPersonaje estado;

    public Personaje() {
        estado = new Personaje_DePie();
    }

    public void setCaminando() {
        estado = new Personaje_Caminando();
    }

    public void setRecostado() {
        estado = new Personaje_Recostado();
    }

    public void setDePie() {
        estado = new Personaje_DePie();
    }

    public void caminar() {
        estado.caminar();
    }

    public void agacharse() {
        estado.agacharse();
    }

    public void levantarse() {
        estado.levantarse();
    }
}

