package pers;

import java.util.ArrayList;

public class Peasant extends Pers {

    int priority;
    private int arrow;

    @Override
    public String toString() {
        return (this.name + " " + Peasant .class.getSimpleName());
    }

    public Peasant(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health, damage, priority);
        this.priority = 0;

    }

    @Override
    public boolean toInfo() {
        return false;
    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if(!heroIsDead(Peasant.this)){
            if (Peasant.this.getArrow()>0) {
                findNearestEnemy(targetTeam);
                this.arrow -= 1;
                Peasant.this.setArrow(this.arrow);
            }else {
                System.out.println("Нужны еще стрелы");

            }
        }
    }

    private void setArrow(int arrow) {
    }

    private int getArrow() {
        return 0;
    }

}

