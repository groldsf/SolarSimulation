import Listeners.MouseListener;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class PanelBuilder {

    public static JPanel getPanel() {
        Panel panel = new Panel();
        panel.addMouseListener(new MouseListener(panel.getSolarSystem()));
        return panel;
    }

}
