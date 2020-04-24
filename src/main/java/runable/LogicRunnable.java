package runable;

import Entity.GameObject;
import Entity.SolarSystem;

import java.util.Collection;

public class LogicRunnable implements Runnable {

    private Collection<GameObject> gameObjects;
    private final int sleep;

    public LogicRunnable(SolarSystem solarSystem, int sleep) {
        this.gameObjects = solarSystem.getGameObjects();
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (true){
            for (GameObject gameObject : gameObjects) {
                for (GameObject target : gameObjects){
                    if(gameObject ==target){
                        continue;
                    }
                    gameObject.modify(target);
                }
                gameObject.move();
            }
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
