/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Solucion;

/**
 *
 * @author edu-g
 */
public class Computadora {
    private Puertos puertos; 
    private RAM ram;
    private discoDuro disco;

    public Computadora(Puertos puertos, RAM ram, discoDuro disco) {
        this.puertos = puertos;
        this.ram = ram;
        this.disco = disco;
    }          
}
