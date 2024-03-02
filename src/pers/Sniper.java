package pers;

import java.util.ArrayList;
public class Sniper extends Pers {
    int arrow;

    public Sniper(String name, int x, int y) {
        super(name, 100,"sling", 34, 2, 13, 50, 100, new Place(x, y));
        this.arrow = 10;
    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + arrow;
    }

    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {
        if ((health <= 0) || (arrow == 0)) return;
        Pers target = super.findNearestEnemy(enemy);
        if (target == null) return;
        target.getHit(this.powerHit);
        arrow--;
    }
    public  String getInfo(){
        return "Снайпер";
    };
}

