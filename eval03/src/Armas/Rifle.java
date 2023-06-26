/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class Rifle extends Arma{

    private int municiones;
    private String nombre;

    public Rifle(String nombre, int municiones) {
        this.nombre = nombre;
        this.municiones = municiones;
    }

    @Override
    public void Atacar() {
        System.out.println("Disparando "+ nombre +". Municiones restantes: " + municiones);
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando "+ nombre +"...");
        municiones += 10;
        System.out.println("Municiones recargadas. Total: " + municiones);
    }

    @Override
    public Arma clonar() {
        try {
            return (Arma) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return nombre + " con " + municiones + " municiones";
    }
}
