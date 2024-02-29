package pers;

import java.util.ArrayList;



public class Crossbowman extends Pers {
    int accuracy;

    int arrow;

    @Override
    public String toString() {
        return (this.name + " " + Crossbowman.class.getSimpleName());
    }

    public Crossbowman(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health, 10, 4);
        this.arrow = 20;

    }




    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (!heroIsDead(Crossbowman.this)) {
            if (Crossbowman.this.getArrow() > 0) {
                findNearestEnemy(targetTeam).getDamage(r.nextInt(10));
                this.arrow -= 1;
                if (Crossbowman.this.getArrow() == 0) {
                    System.out.println("Нужны еще стрелы");
                }
            }
        }
    }

    private int getArrow() {
        return 0;
    }

    public  String getInfo(){
        return "Арбалетчик";
    };


}




