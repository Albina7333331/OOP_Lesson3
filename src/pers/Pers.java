package pers;

import java.util.Random;

public abstract class Pers {
    Place position;
    protected static Random r;
    protected String name;

    static {
        Pers.r = new Random();
    }

    protected Pers(int x, int y, String name) {
        position = new Place(x, y);
        this.name = name;
    }

    public void print() {

        System.out.println("x=" + position.getx() + " " + "y=" +  position.gety() + " " + "Name: " + name);
    }
}

