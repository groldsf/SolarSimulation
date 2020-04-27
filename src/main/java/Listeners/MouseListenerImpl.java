package Listeners;

import Entity.GameObject;
import Entity.SolarSystem;
import Entity.SpeedVector;

import java.awt.event.MouseEvent;
import java.util.Random;

public class MouseListenerImpl implements java.awt.event.MouseListener {
    private final SolarSystem solarSystem;

    public MouseListenerImpl(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    private int x1 = 0;
    private int y1 = 0;
    private long time1 = 0;


    private int x2;
    private int y2;
    private long time2;

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        x1 = mouseEvent.getX();
        y1 = mouseEvent.getY();
        time1 = System.currentTimeMillis();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        x2 = mouseEvent.getX();
        y2 = mouseEvent.getY();
        time2 = System.currentTimeMillis();

        long size = (time2-time1)/100;
        size = 5;

        Random random = new Random();
        GameObject add = new GameObject(
                x1,
                y1,
                size,
                new SpeedVector((x2-x1)/20,(y2-y1)/20),
                random.nextInt(1000)+1
        );
        solarSystem.addObject(add);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
