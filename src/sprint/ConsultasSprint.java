/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import scrumproject.Conexion;

/**
 *
 * @author Nicole
 */
public class ConsultasSprint {

    private final Conexion conexion;

    public ConsultasSprint() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }

    public void guardarSprint(Sprint sprint) throws SQLException {
        Statement instancia;
        instancia = conexion.getInstancia();
        String query;
        Connection con = instancia.getConnection();
        PreparedStatement p = con.prepareStatement("INSERT INTO sprint (NOMBRE, FECHA_INICIO, FECHA_FIN) VALUES(?,?,?)");
        p.setString(1, sprint.getNombre());
        p.setDate(2, new Date(sprint.getFechaInicio().getTime()));
        p.setDate(3, new Date(sprint.getFechaFin().getTime()));
        //query = String.format("INSERT INTO sprint (NOMBRE, FECHA_INICIO, FECHA_FIN) VALUES(\"%s\", \'%s\', \'%s\')",sprint.getNombre(), sprint.getFechaInicio(), sprint.getFechaFin());
        //System.out.println(query);
       // ResultSet result = instancia.executeQuery(query);
        int result = p.executeUpdate();
    }

}
