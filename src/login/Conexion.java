
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
    private final Connection conexion;

    public Conexion() throws ClassNotFoundException, SQLException {
        this("root", "nicolesql");
    }

    public Conexion(String usuarioBD, String contraseniaBD) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(JDBC_URL, usuarioBD, contraseniaBD);
    }

    public Statement getInstancia() throws SQLException {
        return conexion.createStatement();
    }

    public String verificarUsuario(String usuario, String contrasenia) {
        String mensaje;
        try {
            Statement instancia = getInstancia();
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
        } catch (SQLException ex) {
            mensaje = "Ocurrio un error al ingresar los datos";
        }
        return mensaje;
    }
}
