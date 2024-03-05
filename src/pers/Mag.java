package pers;

import java.util.ArrayList;


public class Mag extends Pers {
    int mana;
    boolean flag = false;
    String magic;
    public Mag(String name, int x, int y) {
        super(name, 120, "magicStick", 20, 1, 10, 50, 40, new Place(x, y));
        mana = 10;
        magic = "wizardDust";
    }
    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {
        if (getHp() <= 0) return;
        ArrayList<Pers> sortlist = new ArrayList<>(friend);
        ArrayList<Pers> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());

        for (Pers pers : sortlist) {
            if (pers.getHp() == 0) {
                deadlist.add(pers);

            }
        }
        if (deadlist.size() > 3 ) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.priority - o1.priority);
            deadlist.getFirst().health = maxHealth;
            mana = 0;
            System.out.println("Воскресил: " + deadlist.getFirst().name);
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        sortlist.getFirst().health += 10;
        mana -= 2;
    }

    public String getInfo(){
        return "Волшебник";
    };
}
