package Decorator;

public class Cargador extends ArmaDecorator {
    public Cargador(ArmaFuego armaDecorado) {
        super(armaDecorado);
    }

    public void sonido() {
        super.sonido();
    }

    public int balas() {
        return super.balas() + 10; // Incrementa en 10 el número de balas
    }
}
