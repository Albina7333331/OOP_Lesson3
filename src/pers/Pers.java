package pers;

import java.util.ArrayList;
import java.util.Random;
import static pers.Place.getDistance;

public abstract class Pers implements Step {


    Place position;
    protected static Random r;
    protected String name;
    protected int health;
    protected int damage;
    protected int priority;

    static {
        Pers.r = new Random();
    }

    protected Pers(int x, int y, String name, int health, int damage, int priority) {
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

    private int getHealth() {
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


    public void attac (Pers target) {

    }

    public void print() {

        System.out.println("x=" + position.getx() + " " + "y=" + position.gety() + " " + "Name: " + name);
    }


    public abstract boolean toInfo();
}




