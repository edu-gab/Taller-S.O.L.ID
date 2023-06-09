/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author alexc
 */
public class testCambiarBateria {
    public static void main(String[] args){
        Bateria juguete=new Juguete();
        Bateria laptop=new Laptop();
        Bateria cuaderno= new Cuaderno();
        Bateria reloj= new Reloj();
        
        juguete.cambiarBateria();
        laptop.cambiarBateria();
        cuaderno.cambiarBateria();
        reloj.cambiarBateria();
        
    }
}
