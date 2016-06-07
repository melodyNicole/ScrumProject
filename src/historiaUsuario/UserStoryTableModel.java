package historiaUsuario;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nicole
 */
class UserStoryTableModel extends AbstractTableModel {

    private List<UserStory> historias;
    private final String[] columnas = {"Titulo", "Descripcion", "Criterios de Aceptacion", "Complejidad", "Prioridad"};

    public UserStoryTableModel(List<UserStory> historias) {
        this.historias = historias;
    }
    
    public void setData(List<UserStory> historias) {
        this.historias = historias;
    }

    UserStoryTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return historias.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int indice) {
        return columnas[indice];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        UserStory historia = historias.get(fila);
        Object valor = null;
        switch (columna) {
            case 0:
                valor = historia.getTitulo();
                break;
            case 1:
                valor = historia.getDescripcion();
                break;
            case 2:
                valor = historia.getCriterios();
                break;
            case 3:
                valor = historia.getComplejidad();
                break;
            case 4:
                valor = historia.getPrioridad();
                break;
        }
        return valor;
    }
}
