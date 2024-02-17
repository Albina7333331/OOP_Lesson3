package pers;

public class Crossbowman extends Pers{
    int accuracy;
    int amount_of_arrows;

    @Override
    public String toString() {
        return (this.name + " " + Crossbowman .class.getSimpleName());
    }

    public Crossbowman(int id, String name, int health, int stamina, String weapon, int accuracy, int amount_of_arrows) {
        super(id, name, health, stamina, weapon);
        this.accuracy = accuracy;
        this.amount_of_arrows = amount_of_arrows;
    }
}
