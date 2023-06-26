/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

import java.util.Hashtable;

/**
 *
 * @author bastian rodriguez y cristian yañez
 */
public class prototiposArmas {
    public static Hashtable<String, Arma> prototipos = new Hashtable<>();

    public static void agregarPrototipo(String nombre, Arma arma) {
        prototipos.put(nombre, arma.clonar());
    }

    public static Arma obtenerPrototipo(String nombre) {
        return prototipos.get(nombre);
    }
}