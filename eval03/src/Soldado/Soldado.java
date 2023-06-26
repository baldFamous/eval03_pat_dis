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
public abstract class Soldado {
    
    //metodos abstractos para crear un soldado
    public abstract void Vida();
    public abstract void Mover();
    public abstract void Atacar();
    public abstract void Defender();
    public abstract void setArmaPrincipal(Arma armaPrincipal);
    public abstract Arma getArmaPrincipal();

}
