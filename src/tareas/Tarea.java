/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author Carla
 */
public class Tarea {
      private String titulo;
      private String descripcion;
      public Tarea(String titulo,String descripcion){
        this.titulo=titulo;
        this.descripcion=descripcion;
     }
      public String getTitulo(){
        return titulo;
      }
      public String getDescripcion(){
         return descripcion;
      }
}
