package pers;

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

    public void setPlace(int value1, int value2){
        this.x = value1;
        this.y = value2;
    }
    public String toString(){
        return x + "," + y;
    }

    public double getDistance(Place target) {
        double d = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return d;
    }
    public Place getDiff (Place target) {
        Place diff = new Place(x- target.x, y - target.y);
        return diff;
    }
    public boolean equals(Place target){
        return x == target.x && y ==target.y;
    }
}
