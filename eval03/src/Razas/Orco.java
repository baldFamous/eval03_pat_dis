/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Razas;
/*
    Importamos la clase Soldado pera implementar sus clases heredadas
*/
import Soldado.Jinete;
import Soldado.Tirador;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class Orco extends FabricaRaza{
    
    @Override
    public Tirador crearTirador() {
        return new Tirador(3, 80, 35, 15);
        
    }

    @Override
    public Jinete crearJinete() {
        return new Jinete(12, 150, 50, 30);
    }
    
}
