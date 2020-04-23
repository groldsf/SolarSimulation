package runable;

import javax.swing.*;

public class RepairRunnable implements Runnable {

    private final JFrame frame;
    private final int time;

    public RepairRunnable(JFrame frame, int time) {
        this.frame = frame;
        this.time = time;
    }

    @Override
    public void run() {
        while (true) {
            frame.repaint();
            try {
                Thread.sleep(time);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
