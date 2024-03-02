package pers;
import java.util.ArrayList;

public class Crossbowman extends Pers {
    int arrow;
    public Crossbowman(String name, int x, int y) {
        super(name, 100, "crossbow", 20, 4, 13, 45, 40, new Place(x, y));
        this.arrow = 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + arrow;
    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if ((health <= 0 || arrow == 0)) return;
        Pers target = super.findNearestEnemy(targetTeam);
        if (target == null) return;
        target.getHit(this.powerHit);
        for (Pers pers : friends) {
            if (pers.getInfo().equals("Фермер") && ((Peasant) pers).flag) {
                ((Peasant) pers).flag = true;
                return;
            }
        }
        arrow--;
    }
    public int getArrow() {
        return arrow;
    }
    public  String getInfo(){
        return "Арбалетчик";
    };
}




