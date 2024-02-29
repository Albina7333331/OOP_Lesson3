package pers;

import java.util.ArrayList;
import java.util.Random;
import static pers.Place.getDistance;

public abstract class Pers implements Step {


    public Place position;
    public static Random r;
    public String name;
    public int health;
    public int damage;
    public int priority;

    static {
        Pers.r = new Random();
    }

    public Pers(int x, int y, String name, int health, int damage, int priority) {
        position = new Place(x, y);
        this.name = name;
        this.health = health;
        this.priority = priority;
        this.damage = damage;
    }

    public int getPriority() {
        return priority;
    }


    public boolean heroIsDead(Pers target) {
        if (target.getHealth() <= 0) {
            return false;
        } else
            return true;
    }

    public int getHealth() {
        return 0;
    }

    public Pers findNearestEnemy(ArrayList<Pers> enemies) {
        Pers nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Pers enemy : enemies) {
            if (enemy != null) {
                double distance = getDistance(position, enemy.position);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }
        return nearestEnemy;
    }

    public void getDamage(int damage) {
        this.health -= 1;
    }

//    @Override
//    public String toString() {
//        return  name + ", \u2665: " + health + ",  ⚔ : " + damage + ", \uD83D\uDEE1\uFE0F :" + name;
//    }


    public void attac (Pers target) {

    }

    @Override
    public String toString() {

        return("x=" + position.getx() + " " + "y=" + position.gety() + " " + "Name: " + name);
    }





    public  int getHp(){
        return health;
    }

    public String getInfo(){
        return " ";
    };


}




