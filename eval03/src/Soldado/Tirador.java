/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soldado;

import Armas.Arma;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class Tirador extends Soldado {
    private int movimiento;
    private int vida;
    private int ataque;
    private int defensa;
    private Arma armaPrincipal;
    

    public Tirador(int movimiento, int vida, int ataque, int defensa) {
        this.movimiento = movimiento;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    
    @Override
    public void Vida() {
        System.out.println("La vida de este Tirador es: " + this.vida);
    }

    @Override
    public void Mover() {
        System.out.println("Este Tirador tiene velocidad de movimiento : " + this.movimiento );
    }

    @Override
    public void Atacar() {
        System.out.println("Su fuerza de ataque es: "+ this.ataque);
    }

    @Override
    public void Defender() {
        System.out.println("Su defensa es: "+ this.defensa);
    }

    @Override
    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    @Override
    public String toString() {
        String armaPrincipalStr = (armaPrincipal != null) ? armaPrincipal.toString() : "N/A";

        return "Soldado Tirador:\n Movimiento= " + this.movimiento +
               "\n Vida= " + this.vida +
               "\n Ataque= " + this.ataque +
               "\n Defensa= " + this.defensa +
               "\n Arma Principal= " + this.armaPrincipal;
    }
}
