package pers;

import java.util.ArrayList;


public class Sniper extends Pers {

    int arrow;



    @Override
    public String toString() {
        return (this.name + " " + getArrow() + " " + getHp());
    }

    public Sniper(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health, damage, 3);
        this.arrow = 10;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", \u27b6 : " + arrow;
//    }

//    @Override
//    public boolean toInfo() {
//        return false;
//    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if(!heroIsDead(Sniper.this)){
            if (Sniper.this.getArrow()>0) {
                findNearestEnemy(targetTeam).getDamage(r.nextInt(10));
                this.arrow -= 1;
                if (Sniper.this.getArrow()==0) {
                    System.out.println("Нужны еще стрелы");
                }
            }
        }
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public  String getInfo(){
        return "Снайпер";
    };

}

