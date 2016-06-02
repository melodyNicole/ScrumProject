/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

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
        String fechaInicio = sprint.getFechaInicio();
        String fechaFin = sprint.getFechaFin();
        String query;
        query = String.format("INSERT INTO Sprints VALUES(\"%s\",\"%s\")", sprint.getFechaInicio(), sprint.getFechaFin());
        ResultSet result = instancia.executeQuery(query);
    }

}
