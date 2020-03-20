/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import Modelo.*;
import Paquete.Cola;
import Paquete.Pila;

/**
 *
 * @author YorgenGalvis
 */
public class AsignacionesTurnos {

    Cola<Turno> turnosModulo1, turnosModulo2 = null;
    Pila<String> nTurnos = null;

    public AsignacionesTurnos(int totalTurnosHoy) {
        turnosModulo2 = new Cola();
        turnosModulo1 = new Cola();
        nTurnos = new Pila();
        this.generarNumeros(totalTurnosHoy);
    }
    
    public Turno obtenerTurno(int modulo, Persona asignar) throws Exception {
        Turno obtenido=null;
        if (nTurnos.isEmpty()) {
            throw new Exception("TURNOS: Limite de turnos abiertos al dia excedidos");
        }
        if (modulo == 1) {
            String codigo = "A" + this.nTurnos.desapilar();
            Turno generado=new Turno(codigo, asignar);
            obtenido=generado;
            this.turnosModulo1.encolar(generado);
        } else if (modulo == 2) {
            String codigo = "V" + this.nTurnos.desapilar();
            Turno generado=new Turno(codigo, asignar);
            obtenido=generado;
            this.turnosModulo2.encolar(generado);
        } else {
            throw new Exception("Generar codigo: ERROR AL GENERAR EL CODIGO.");
        }
        return obtenido;
    }

    void generarNumeros(int total) {
        for (int i = total; i >= 0; --i) {
            if (i < 10) {
                this.nTurnos.apilar("00" + i);
            }
            if (i >= 10) {
                this.nTurnos.apilar("0" + i);
            }
        }
    }

    public Turno liberarTurno(int modulo) throws Exception {
        Turno resultado=null;
        if (modulo == 1) {
            if (this.turnosModulo1.isEmpty()) {
                resultado=this.turnosModulo1.desencolar();
            }
        } else if (modulo == 2) {
            if (this.turnosModulo2.isEmpty()) {
                resultado=this.turnosModulo2.desencolar();
            }
        } else {
            throw new Exception("Error al ingresar el modulo.");
        }
        return resultado;
    }

}
