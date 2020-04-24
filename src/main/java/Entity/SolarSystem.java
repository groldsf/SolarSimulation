package Entity;

import UtilClasses.Painter;
import UtilClasses.UtilConstant;

import java.awt.*;
import java.util.Collection;
import java.util.HashSet;

public class SolarSystem {

    private final Collection<GameObject> gameObjects = new HashSet<>();
    private final GameObject solar;
    private final Painter painter;

    private SolarSystem(){
        solar = new GameObject(500,500,20, new SpeedVector(0,0), 20000);
        GameObject earth = new GameObject(500,400,5, new SpeedVector(10,0), 100);
        GameObject mars = new GameObject(500,200,6, new SpeedVector(6,0), 120);
        GameObject pl = new GameObject(500,100,10, new SpeedVector(5.7,0), 200);
        GameObject sp = new GameObject(500,110,3, new SpeedVector(3,0), 1);

        gameObjects.add(pl);
        gameObjects.add(sp);
        gameObjects.add(earth);
        gameObjects.add(mars);
        gameObjects.add(solar);

        painter = new Painter(solar);
    }

    private static final SolarSystem solarSystem = new SolarSystem();
    public static SolarSystem getInstance(){
        return solarSystem;
    }

    public void paint(Graphics g){

        for (GameObject gameObject : gameObjects) {
            painter.paint(g,gameObject);
        }
    }

    public Collection<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void addObject(GameObject add) {
        add.setX(add.getX() + solar.getX() - (UtilConstant.WIDTH >> 1));
        add.setY(add.getY() + solar.getY() - (UtilConstant.LENGTH >> 1));
        gameObjects.add(add);
    }
}
