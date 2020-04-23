package Entity;

import UtilClasses.UtilConstant;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.sqrt;

public class Object {

    private final Color color;
    private double x;
    private double y;
    private double r;


    private final SpeedVector  speed;
    private final double weight;

    public void modify(Object target){
        double squareLen = (x-target.x)*(x-target.x) + (y-target.y)*(y-target.y);
        double len = sqrt(squareLen);
        if(len <= r+target.r){
            return;
        }
        double a = UtilConstant.G * target.weight / squareLen;
        double xmod = a/len*(target.x - x);
        double ymod = a/len*(target.y - y);
        speed.modify(xmod, ymod);
    }

    public void move() {
        x+=speed.getX();
        y+=speed.getY();
    }

    public Object(double x, double y, double r, SpeedVector speed, double weight){
        this.speed = speed;
        this.weight = weight;
        this.color = new Color(new Random().nextInt());
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void paint(Graphics g, double mx, double my) {
        g.setColor(color);
        g.fillOval((int)(mx + x-r),(int)(my + y-r),(int)(r+r),(int)(r+r));

        g.setColor(Color.RED);
        double mn = r;
        g.drawLine((int)(mx + x),(int)(my + y),(int)(mx + speed.getX()*mn+x),(int)(my + speed.getY()*mn+y));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
