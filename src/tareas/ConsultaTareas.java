/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import scrumproject.Conexion;

/**
 *
 * @author Carla
 */
 
public class ConsultaTareas {
     private final  Conexion conexion;
     public ConsultaTareas()throws ClassNotFoundException, SQLException { 
         conexion=new Conexion();
     }
      public int guardarTarea(Tarea tarea) throws SQLException
      {
       Statement instancia;
        instancia = conexion.getInstancia();
        String titulo = tarea.getTitulo();
        String despripcion = tarea.getDescripcion();
        String query;
        query = String.format("INSERT INTO tarea (titulo,descripcion) VALUES(\"%s\",\"%s\")",titulo,despripcion);
        int result = instancia.executeUpdate(query);
       
        return result;
      }
}
