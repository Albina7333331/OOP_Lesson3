package pers;

public class Place {
    int x;
    int y;
    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setPlace(int value1, int value2){
        this.x = value1;
        this.y = value2;
    }
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }

    @Override
    public String toString(){
        return x + "," + y;
    }

    public double getDistance(Place targets) {
        double d = Math.sqrt(Math.pow(x - targets.x, 2) + Math.pow(y - targets.y, 2));
        return d;
    }
    public Place getDiff (Place targets) {
        Place diff = new Place(x- targets.x, y - targets.y);
        return diff;
    }
    public boolean equals(Place targets){
        return x == targets.x && y == targets.y;
    }
}
