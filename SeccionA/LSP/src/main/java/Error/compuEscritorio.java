/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error;

/**
 *
 * @author joelorrala
 */
public class compuEscritorio implements Maquina {

    @Override
    public void encender() {
        System.out.println("Encendiendo computadora de escritorio");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando computadora de escritorio");
    }
}
