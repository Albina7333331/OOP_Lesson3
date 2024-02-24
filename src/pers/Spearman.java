package pers;

import java.util.ArrayList;

public class Spearman extends Pers {
    int protection;
    int strength;
    int priority;
    private int arrow;


    @Override
    public String toString() {
        return (this.name + " " + Spearman.class.getSimpleName());
    }


    public Spearman(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health,damage, priority);
        this.protection = protection;
        this.strength = strength;
        this.priority = 4;
    }

    @Override
    public void step(ArrayList<Pers> targetTeam) {
        if(!heroIsDead(Spearman.this)){
            if (Spearman.this.getArrow()>0) {
                findNearestEnemy(targetTeam);
                this.arrow -= 1;
                Spearman.this.setArrow(this.arrow);
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

