/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Error;

/**
 *
 * @author edu-g
 */
public class Computadora {
    private Puertos puertos; 
    private RAM ram;
    private discoDuro disco;

    public Computadora(Puertos puertos, RAM ram, discoDuro disco) {
        this.puertos = new Puertos();
        this.ram = new RAM();
        this.disco = new discoDuro();
    }          
}
