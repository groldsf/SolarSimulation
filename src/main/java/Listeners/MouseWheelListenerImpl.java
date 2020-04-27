package Listeners;

import UtilClasses.GlobalParams;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelListenerImpl implements MouseWheelListener {

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        GlobalParams.factor *= 1+mouseWheelEvent.getPreciseWheelRotation()*0.2;
    }
}
