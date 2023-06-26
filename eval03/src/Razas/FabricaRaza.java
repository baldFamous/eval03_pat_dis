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
public abstract class FabricaRaza {
    
    public abstract Tirador crearTirador();
    public abstract Jinete crearJinete();
    
    
}
