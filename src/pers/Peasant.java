package pers;

public class Peasant extends Pers {


    @Override
    public String toString() {
        return (this.name + " " + Peasant .class.getSimpleName());
    }

    public Peasant(int x, int y, String name) {
        super(x, y, name);

    }

}

