/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author luisf
 */
public class Main {
    public static void main(String[] args) {
        //Se instancia la persona y el banco
        Banco bcr = new Banco(1000);
        Persona juan = new Persona("203450256", "Juan", "27738290");
        //Se crea la solicitud de Juan por 120
        SolicitudPrestamo solicitudJuan = new SolicitudPrestamo(juan,120);
        //Se envia la solicitud al banco
        bcr.revisarSolicitud(solicitudJuan);
    }
}
