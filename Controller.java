import javax.management.modelmbean.ModelMBean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;

    public Controller(Viewer viewer) {
        model = new Model(viewer);
    }
    
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        model.doAction(command);
    }
}
