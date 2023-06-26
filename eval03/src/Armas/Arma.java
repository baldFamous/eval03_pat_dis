/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public abstract class Arma implements Cloneable{
    
    public abstract void Atacar();
    public abstract void Recargar();
    public abstract Arma clonar();
}
