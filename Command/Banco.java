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
public class Banco {
    private int fondos;

    public Banco(int fondos) {
        this.fondos = fondos;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }
    
    
    public void revisarSolicitud(SolicitudPrestamo solicitud){
        solicitud.getPersona().setDeuda(solicitud.getPersona().getDeuda()+ solicitud.getMontoPrestamo());
        fondos = fondos - solicitud.getMontoPrestamo();
    }
}
