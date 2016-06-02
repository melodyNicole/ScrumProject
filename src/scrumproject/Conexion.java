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
   public Conexion()
   {}
   public Connection getConexion(){
    Connection con=null;
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           //nombre de la base de datos sera ScrumMaster
           con= DriverManager.getConnection("jdbc:mysql://localhost/ScrumMaster", "root", "");
       } catch (Exception e) {
       }
     return con;
   }
}
