import Entity.SolarSystem;
import runable.LogicRunnable;
import runable.RepairRunnable;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = FrameBuilder.getFrame();
        SolarSystem solarSystem = SolarSystem.getInstance();

        Thread thread2 = new Thread(new RepairRunnable(frame, 10));
        thread2.start();

        Thread thread1 = new Thread(new LogicRunnable(solarSystem, 10));
        thread1.start();




    }
}
