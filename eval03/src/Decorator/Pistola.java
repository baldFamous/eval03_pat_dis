package Decorator;

public class Pistola extends ArmaBase {
    @Override
    public void sonido() {
        System.out.println("Sonido de pistola: Bang!");
    }

    @Override
    public int balas() {
        return 10;
    }
}
