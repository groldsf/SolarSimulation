package Entity;

import UtilClasses.UtilConstant;

import java.awt.*;
import java.util.ArrayList;

public class SolarSystem {

    private final ArrayList<Object> objects = new ArrayList<>();
    private final Object solar;

    private SolarSystem(){
        solar = new Object(500,500,20, new SpeedVector(0,0), 20000);
        Object earth = new Object(500,400,5, new SpeedVector(10,0), 100);
        Object mars = new Object(500,200,6, new SpeedVector(6,0), 120);
        Object pl = new Object(500,100,10, new SpeedVector(5.7,0), 200);
        Object sp = new Object(500,110,3, new SpeedVector(3,0), 1);

        objects.add(pl);
        objects.add(sp);
        objects.add(earth);
        objects.add(mars);
        objects.add(solar);
    }

    private static final SolarSystem solarSystem = new SolarSystem();
    public static SolarSystem getInstance(){
        return solarSystem;
    }

    public void paint(Graphics g){
        double x = -solar.getX() + (UtilConstant.WIDTH >> 1);
        double y = -solar.getY()+ (UtilConstant.LENGTH >> 1);
//        double x = 0;
//        double y = 0;
        for (Object object :objects) {
            object.paint(g, x, y);
        }
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }
}
