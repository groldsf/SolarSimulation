import UtilClasses.UtilConstant;

import javax.swing.*;
import java.awt.*;

public class FrameBuilder {


    public static JFrame getFrame() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.getContentPane().add(BorderLayout.CENTER, PanelBuilder.getPanel());

        frame.setLocation(0, 0);
        frame.setSize(UtilConstant.WIDTH, UtilConstant.LENGTH);
        frame.setVisible(true);
        return frame;
    }

}
