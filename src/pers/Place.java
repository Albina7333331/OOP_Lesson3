package pers;

public class Place {
    int x, y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getx() {
        return x;
    }

    int gety() {
        return y;
    }

    public static double getDistance(Place one, Place two) {
        return Math.sqrt(Math.pow(two.getx() - one.getx(), 2) + Math.pow(one.gety() - two.gety(), 2));
    }


}
