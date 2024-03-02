package pers;

import java.util.ArrayList;

public class Peasant extends Pers {
    public int priority;
    public int arrow;
    public boolean flag;

    public Peasant(String name, int x,int y) {
        super(name, 130, "arrow", 0, 4, 11, 0, 40, new Place(x, y));
        this.priority = 0;
        this.flag=false;
    }
    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (health <= 0) return;
        flag = false;
    }
    public int getArrow() {
        return arrow;
    }
    public  String getInfo(){
        return "Крестьянин";
    };
    public String toString(){
        return super.toString() + ", \u27b6 : " + arrow;
    }
}

