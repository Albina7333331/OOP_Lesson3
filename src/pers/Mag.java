package pers;

import java.util.ArrayList;

// Колдун. Своё свойство - мана и магия
public class Mag extends Pers {
    int mana;
    String magic;
    public Mag(String name, int x, int y) {
        super(name, 120, "magicStick", 20, 1, 10, 50, 40, new Place(x,y));
        mana = 200;
        magic = "wizardDust";
    }



    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {

    }

    public String getInfo(){
        return "Волшебник";
    };
}
