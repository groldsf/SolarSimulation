import Listeners.MouseListenerImpl;
import Listeners.MouseWheelListenerImpl;

import javax.swing.*;

public class PanelBuilder {

    public static JPanel getPanel() {
        Panel panel = new Panel();
        panel.addMouseListener(new MouseListenerImpl(panel.getSolarSystem()));
        panel.addMouseWheelListener(new MouseWheelListenerImpl());
        return panel;

    }
}
