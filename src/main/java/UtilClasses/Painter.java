package UtilClasses;

import Entity.GameObject;

import java.awt.*;

public class Painter {


    private final GameObject mainObject;

    public Painter(GameObject mainObject) {
        this.mainObject = mainObject;
    }


    public void paint(Graphics g, GameObject o){
        double x = -mainObject.getX() + (UtilConstant.WIDTH >> 1);
        double y = -mainObject.getY()+ (UtilConstant.LENGTH >> 1);

        paintObject(g, o, x, y);
        paintVector(g, o, x, y);

    }

    private void paintObject(Graphics g, GameObject o, double x, double y){
        g.setColor(o.getColor());
        g.fillOval((int)(o.getX() + x - o.getR()),(int)(o.getY() + y - o.getR()),(int)(o.getR()*2),(int)(o.getR()*2));
    }
    private void paintVector(Graphics g, GameObject o, double x, double y){
        g.setColor(Color.RED);
        double mn = o.getR();
        g.drawLine(
                (int)(o.getX() + x),
                (int)(o.getY() + y),
                (int)(o.getX() + o.getSpeed().getX()*mn+x),
                (int)(o.getY() + o.getSpeed().getY()*mn+y)
        );
    }
}
