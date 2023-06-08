/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notificacion;

/**
 *
 * @author alexc
 */
 interface MetodoNotificacion {
    void notificar();
}

public class Notificacion {
    private MetodoNotificacion metodoNotificacion;

    public void setMetodoNotificacion(MetodoNotificacion metodoNotificacion) {
        this.metodoNotificacion = metodoNotificacion;
    }

    public void notificar() {
        if (metodoNotificacion != null) {
            metodoNotificacion.notificar();
        }
    }
}

class EmailNotificacion implements MetodoNotificacion {
    @Override
    public void notificar() {
        // Lógica para enviar un correo electrónico
    }
}

class SMSNotificacion implements MetodoNotificacion {
    @Override
    public void notificar() {
        // Lógica para enviar un mensaje de texto (SMS)
    }
}

