package UtilClasses;

import Entity.GameObject;

import java.awt.*;

public class Painter {


    private final GameObject mainObject;

    public Painter(GameObject mainObject) {
        this.mainObject = mainObject;
    }


    public void paint(Graphics g, GameObject o) {
        paintObject(g, o);
        paintVector(g, o);
    }

    private void paintObject(Graphics g, GameObject o) {
        double factor = GlobalParams.factor;
        g.setColor(o.getColor());
        int x1 = (int) ((-mainObject.getX() + o.getX() - o.getR()) * factor + (UtilConstant.WIDTH >> 1));
        int y1 = (int) ((-mainObject.getY() + o.getY() - o.getR()) * factor + (UtilConstant.LENGTH >> 1));
        int len = (int) (o.getR() * 2 * factor);
        g.fillOval(
                x1,
                y1,
                len,
                len
        );
    }

    private void paintVector(Graphics g, GameObject o) {
        double factor = GlobalParams.factor;
        double x1 = (o.getX() - mainObject.getX()) * factor + (UtilConstant.WIDTH >> 1);
        double y1 = (o.getY() - mainObject.getY()) * factor + (UtilConstant.LENGTH >> 1);

        g.setColor(Color.RED);
        double mn = o.getR();
        g.drawLine(
                (int) x1,
                (int) y1,
                (int) (x1 + o.getSpeed().getX() * mn * factor),
                (int) (y1 + o.getSpeed().getY() * mn * factor)
        );
    }

}
