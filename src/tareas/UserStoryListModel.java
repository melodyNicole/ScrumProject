package tareas;

import historiaUsuario.UserStory;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Nicole
 */
class UserStoryListModel extends AbstractListModel implements ComboBoxModel {

    private List<UserStory> historiasDeUsuario;
    private UserStory selectedItem;

    public UserStoryListModel(List<UserStory> historiasDeUsuario) {
        this.historiasDeUsuario = historiasDeUsuario;
    }
    
    public void setData(List<UserStory> historiasDeUsuario) {
        this.historiasDeUsuario = historiasDeUsuario;
    }

    @Override
    public int getSize() {
        return historiasDeUsuario.size();
    }

    @Override
    public Object getElementAt(int index) {
        return historiasDeUsuario.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        for (UserStory userStory : historiasDeUsuario) {
            if(anItem.equals(userStory)) {
                selectedItem = (UserStory) anItem;
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
