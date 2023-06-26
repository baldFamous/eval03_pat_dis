package Decorator;

public class Rifle extends ArmaBase {
    @Override
    public void sonido() {
        System.out.println("Sonido de rifle: Pum!");
    }

    @Override
    public int balas() {
        return 30;
    }
}
