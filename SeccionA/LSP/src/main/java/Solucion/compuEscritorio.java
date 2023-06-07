/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solucion;

/**
 *
 * @author joelorrala
 */
public class compuEscritorio implements Maquina {

    @Override
    public void encender() {
        System.out.println("encendiendo computadora de escritorio");
    }

    @Override
    public void apagar() {
        System.out.println("apagando computadora de escritorio");
    }
}
