/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author YorgenGalvis
 */
public class Turno {
    String codTurno;
    Persona personaAsignada;

    public Turno() {
    }

    public Turno(String codTurno, Persona personaAsignada) {
        this.codTurno = codTurno;
        this.personaAsignada = personaAsignada;
    }

    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    public Persona getPersonaAsignada() {
        return personaAsignada;
    }

    public void setPersonaAsignada(Persona personaAsignada) {
        this.personaAsignada = personaAsignada;
    }
    
    
}
