package pers;

public class Magic extends Pers {
    int intellect;
    int mana;

    @Override
    public String toString() {
        return (this.name + " " + Magic.class.getSimpleName());
    }

    public Magic(int x, int y, String name) {
        super(x, y, name);

    }
}
