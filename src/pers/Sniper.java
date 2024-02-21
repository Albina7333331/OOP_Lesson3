package pers;

public class Sniper extends Pers {
    int accuracy;
    int disguise;


    @Override
    public String toString() {
        return (this.name + " " + Sniper.class.getSimpleName());
    }

    public Sniper(int x, int y, String name) {
        super(x, y, name);
//        this.accuracy = accuracy;
//        this.disguise = disguise;
    }
}

