/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carla
 */
public class Conexion {
    public Conexion1()
   {}
   public Connection getConexion(){
    Connection con=null;
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con= DriverManager.getConnection("jdbc:mysql://localhost/ScrumProject, "root", "");
       } catch (Exception e) {
       }
     return con;
   }
}
