package pers;

public class Spearman extends Pers {
    int protection;
    int strength;

    @Override
    public String toString() {
        return (this.name + " " + Spearman.class.getSimpleName());
    }


    public Spearman(int x, int y, String name) {
        super(x, y, name);
        this.protection = protection;
        this.strength = strength;
    }
}

