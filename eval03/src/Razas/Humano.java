/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Razas;

import Soldado.Jinete;
import Soldado.Tirador;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class Humano extends FabricaRaza{

    @Override
    public Tirador crearTirador() {
        return new Tirador(5, 100, 30, 20);
    }

    @Override
    public Jinete crearJinete() {
        return new Jinete(10, 120, 40, 25);
    }
    
}
