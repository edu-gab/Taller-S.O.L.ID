/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solucion;

/**
 *
 * @author joelorrala
 */
public class ArrancarMaquina {

    public static void main(String[] args) {
        Maquina maq;
        String tipoMaquina = args[0];
        if ("lap" == tipoMaquina) {
            maq = new Laptop();
        } else if ("escri" == tipoMaquina) {
            maq = new compuEscritorio();
        } else {
            throw new RuntimeException("máquina inválida");
        }
        maq.encender();
    }
}
