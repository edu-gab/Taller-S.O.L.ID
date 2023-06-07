/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error;

/**
 *
 * @author joelorrala
 */
public class ArrancarMaquina {

    public static void main(String[] args) {

        Maquina map;

        String tipoMaquina = args[0];
        if ("escri" == tipoMaquina) {
            compuEscritorio com = new compuEscritorio();
            com.encender();
        } else if ("lap" == tipoMaquina) {
            Laptop l = new Laptop();
            if ((l.hasEnoughBattery())) {
                l.encender();
            }
        } else {
            throw new RuntimeException("Máquina inválida");
        }
    }
}
