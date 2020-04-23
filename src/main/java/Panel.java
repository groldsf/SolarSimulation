import Entity.SolarSystem;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Color background = Color.GRAY;

    SolarSystem solarSystem = SolarSystem.getInstance();


    public void paintComponent(Graphics g) {
        g.setColor(background);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        solarSystem.paint(g);
    }

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }
}
