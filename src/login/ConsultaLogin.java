/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import scrumproject.Conexion;

/**
 *
 * @author Nicole
 */
public class ConsultaLogin {

    private final Conexion conexion;

    public ConsultaLogin() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }

    public boolean verificarUsuario(String usuario, String contrasenia) {
        boolean autenticado = false;
        try {
            Statement instancia = conexion.getInstancia();
            String query = String.format("SELECT DISTINCT PASSWORD from "
                    + "login WHERE USER = \"%s\"", usuario);
            ResultSet result = instancia.executeQuery(query);
            if (result.first()) { // si existe la primera fila
                if (result.getString(1).equals(contrasenia)) {
                    autenticado = true;
                }
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return autenticado;
    }

}
