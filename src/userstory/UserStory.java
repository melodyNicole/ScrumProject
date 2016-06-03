/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userstory;

/**
 *
 * @author Nicole
 */
public class UserStory {
    
    private String titulo;
    private String descripcion;
    private String criteriosAceptacion;
    private int complejidad;
    private int prioridad;

    public UserStory(String titulo,String descripcion,String criteriosAceptacion,int complejidad, int prioridad)
    {
       this.titulo=titulo;
       this.descripcion=descripcion;
       this.criteriosAceptacion=criteriosAceptacion;
       this.complejidad=complejidad;
       this.prioridad=prioridad;
    }
    
    String getTitulo() {
      return titulo;
    }

    String getDescripcion() {
       return descripcion;
    }

    String getCriterios() {
        return criteriosAceptacion;
    }

    int getComplejidad() {
        return complejidad;
    }

    int getPrioridad() {
        return prioridad;
    }
    
    
    
}
