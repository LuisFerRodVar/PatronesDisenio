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
public class SolicitudPrestamo {
    private Persona persona;
    private int montoPrestamo;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public SolicitudPrestamo(Persona persona, int montoPrestamo) {
        this.persona = persona;
        this.montoPrestamo = montoPrestamo;
    }
    
}
