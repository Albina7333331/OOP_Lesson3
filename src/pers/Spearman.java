package pers;

public class Spearman extends Pers{
    int protection;
    int strength;

    @Override
    public String toString() {
        return (this.name + " " + Spearman .class.getSimpleName());
    }


    public Spearman(int id, String name, int health, int stamina, String weapon, int protection, int strength) {
        super(id, name, health, stamina, weapon);
        this.protection = protection;
        this.strength = strength;
    }
}

