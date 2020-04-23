package runable;

import Entity.Object;
import Entity.SolarSystem;

import java.util.ArrayList;

public class LogicRunnable implements Runnable {

    private ArrayList<Object> objects;
    private final int sleep;

    public LogicRunnable(SolarSystem solarSystem, int sleep) {
        this.objects = solarSystem.getObjects();
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (true){
            for (Object object : objects) {
                for (Object target : objects){
                    if(object==target){
                        continue;
                    }
                    object.modify(target);
                }
                object.move();
            }
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
