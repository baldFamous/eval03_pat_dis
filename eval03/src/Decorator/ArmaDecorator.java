package Decorator;

public abstract class ArmaDecorator implements ArmaFuego {
    protected ArmaFuego armaDecorado;

    public ArmaDecorator(ArmaFuego armaDecorado) {
        this.armaDecorado = armaDecorado;
    }

    public void sonido() {
        armaDecorado.sonido();
    }

    public int balas() {
        return armaDecorado.balas();
    }
}
