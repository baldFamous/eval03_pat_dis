/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class Espada extends Arma{

    private int longitud;
    private String nombre;

    public Espada(String nombre, int longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    @Override
    public void Atacar() {
        System.out.println("Atacando con " + nombre + " de longitud " + longitud);
    }

    @Override
    public void Recargar() {
        System.out.println("Descansando despues de usar " + nombre + "...");
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
        return nombre + " de longitud " + longitud;
    }
}
