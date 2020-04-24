package Entity;

import UtilClasses.UtilConstant;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.sqrt;

public class GameObject {

    private final Color color;
    private double x;
    private double y;
    private double r;


    private final SpeedVector  speed;
    private final double weight;

    public void modify(GameObject target){
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

    public GameObject(double x, double y, double r, SpeedVector speed, double weight){
        this.speed = speed;
        this.weight = weight;
        this.color = new Color(new Random().nextInt());
        this.x = x;
        this.y = y;
        this.r = r;
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
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

    public Color getColor() {
        return color;
    }

    public SpeedVector getSpeed() {
        return speed;
    }
}
