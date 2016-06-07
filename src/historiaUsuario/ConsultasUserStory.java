package historiaUsuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import scrumproject.Conexion;

/**
 *
 * @author Nicole
 */
public class ConsultasUserStory {

    private final Conexion conexion;

    public ConsultasUserStory() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }

    public int guardarHistoria(UserStory story) throws SQLException {
        Statement instancia;
        instancia = conexion.getInstancia();
        String titulo = story.getTitulo();
        String despripcion = story.getDescripcion();
        String criteriosDeAceptacion = story.getCriterios();
        int complejidad = story.getComplejidad();
        int prioridad = story.getPrioridad();
        String query;
        query = String.format("INSERT INTO historiadeusuario (titulo,descripcion,criteriosAceptacion,complejidad,prioridad) VALUES(\"%s\",\"%s\",\"%s\",%d,%d)", titulo, despripcion, criteriosDeAceptacion, complejidad, prioridad);
        int result = instancia.executeUpdate(query);
        System.out.println(result);
        return result;
    }

    public List<UserStory> ObtenerHistorias() throws SQLException {
    
        List<UserStory> userStories = new ArrayList();
        Statement instancia;
        instancia = conexion.getInstancia();
        String query;
        query = String.format("Select * from historiadeusuario");
        ResultSet result = instancia.executeQuery(query);

        if (result.first()) {
            do {
                Long id = result.getLong("idhistoriadeusuario");
                String titulo = result.getString("titulo");
                String descripcion = result.getString("descripcion");
                String criterio = result.getString("criteriosAceptacion");
                int complejidad = result.getInt("complejidad");
                int prioridad = result.getInt("prioridad");
                UserStory userStory = new UserStory(titulo, descripcion, criterio, complejidad, prioridad);
                userStory.setId(id);
                userStories.add(userStory);
                result.next();
            } while (!result.isLast());
            result.close();
        }
        return userStories;
    }
}
