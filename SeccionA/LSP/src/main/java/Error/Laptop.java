/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error;

/**
 *
 * @author joelorrala
 */
public class Laptop implements Maquina {

    private int bateria;

    @Override
    public void encender() {
        System.out.println("encendiendo laptop");
    }

    @Override
    public void apagar() {
        System.out.println("apagando laptop");
    }

    public boolean hasEnoughBattery() {
        System.out.println("verificando bateria");
        if (bateria < 10) {
            return false;
        } else {
            return true;
        }
    }
}
