/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rocio Ramirez
 * @author Luana
 */
public class Conexion {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sis2";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        Connection connection = DriverManager.getConnection(JDBC_URL, "root", "nicolesql");
        return connection;
    }

    public String verificarUsuario(String usuario, String contrasenia) {
        String mensaje;
        try {
            Connection conexion = getConnection();
            Statement instancia = conexion.createStatement();
            String query = String.format("SELECT DISTINCT PASSWORD from "
                    + "login WHERE USER = \"%s\"", usuario);
            ResultSet result = instancia.executeQuery(query);
            if (result.first()) { // si existe la primera fila
                if (result.getString(1).equals(contrasenia)) {
                    mensaje = "Usuario Autenticado";
                } else {
                    mensaje = "Contraseña Invalida";
                }
            } else {
                mensaje = "Nombre de usuario invalido";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = "Ocurrio un error al ingresar los datos";
        }
        return mensaje;
    }
}
