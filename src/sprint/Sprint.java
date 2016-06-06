/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

import java.util.Date;

/**
 *
 * @author Nicole
 */
class Sprint {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;

    public Sprint(String nombre,Date fechaInicio, Date fechaFin) {
        this.nombre=nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

  
    Date getFechaInicio() {
        return fechaInicio;
    }

    Date getFechaFin() {
        return fechaFin;
    }
    String getNombre(){
    return nombre;
}
}
