package Decorator;

public class Silenciador extends ArmaDecorator {
    public Silenciador(ArmaFuego armaDecorado) {
        super(armaDecorado);
    }

    public void sonido() {
        super.sonido();
        System.out.println("Silenciando el sonido del arma...");
    }

    public int balas() {
        return super.balas();
    }
}
