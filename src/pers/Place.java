package pers;

import javax.swing.text.Position;

public class Place {
    int x, y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public static double getDistance(Place one, Place two) {
        return Math.sqrt(Math.pow(two.getx() - one.getx(), 2) + Math.pow(one.gety() - two.gety(), 2));
    }

    public Place getDiff (Place targetPos) {
        return new Place(x - targetPos.getx(), y - targetPos.gety());
    }
    public boolean equals(Place unit){
        return x == unit.getx() && y ==unit.gety();

    }

    public void setx(int i) {
    }


//    public void setx(int i) {
//    }
}
