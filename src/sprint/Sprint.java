/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

/**
 *
 * @author Nicole
 */
class Sprint {

    private String fechaInicio;
    private String fechaFin;

    public Sprint(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    String getFechaInicio() {
        return fechaInicio;
    }

    String getFechaFin() {
        return fechaFin;
    }
    
}
