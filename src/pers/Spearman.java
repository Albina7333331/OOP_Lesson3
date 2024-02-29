package pers;
import java.lang.Math.*;
import javax.swing.text.Position;
import java.util.ArrayList;

import static pers.Pers.r;

public class Spearman extends Pers {
    int protection;
    int strength;
    public int priority;
    public int arrow;
    public int anger;


    @Override
    public String toString() {
        return (this.name + " " + Spearman.class.getSimpleName());
    }


    public Spearman(int x, int y, String name, int health, int damage, int priority, int anger) {
        super(x, y, name, health, damage, priority);
        this.priority = 4;
        this.anger = 30;
        this.position = new Place(x, y);

    }

@Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (!heroIsDead(Spearman.this)) return;
        Pers unit = findNearestEnemy(targetTeam);
        if (position.getDistance(unit.position, this.position) < 11) {
            attac(unit);
            return;
        }
        Place diff = this.position.getDiff(unit.position);
        Place currentPos = new Place(position.getx(), position.gety());
        if (Math.abs(diff.getx()) > Math.abs(diff.gety())) {
            position.setx(position.getx() + diff.getx() > 0 ? 1 : -1);
        }




    }



    public  String getInfo(){
        return "Копейщик";
    };
}


