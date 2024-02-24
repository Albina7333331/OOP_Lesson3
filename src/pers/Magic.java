package pers;

import java.util.ArrayList;

public class Magic extends Pers {
    int intellect;
    int mana;
    int priority;
    private int arrow;


    @Override
    public String toString() {
        return (this.name + " " + Magic.class.getSimpleName());
    }

    public Magic(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health,damage, priority);
        this.intellect = intellect;
        this.mana = mana;
        this.priority = 1;


    }

    @Override
    public void step(ArrayList<Pers> targetTeam) {
        if(!heroIsDead(Magic.this)){
            if (Magic.this.getArrow()>0) {
                findNearestEnemy(targetTeam);
                this.arrow -= 1;
                Magic.this.setArrow(this.arrow);
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
