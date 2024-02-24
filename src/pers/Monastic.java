package pers;
import java.util.ArrayList;




public class Monastic extends Pers{
    int belief;
    int chakra;

    private int arrow;

    @Override
    public String toString(){
        return (this.name + " " + Monastic.class.getSimpleName());
    }




    public Monastic(int x, int y, String name, int health, int damage, int priority) {
        super(x, y, name, health,damage, priority);
        this.belief = belief;
        this.chakra = chakra;
        this.priority = 0;
    }

    @Override
    public void step(ArrayList<Pers> targetTeam) {
        if(!heroIsDead(Monastic.this)){
            if (Monastic.this.getArrow()>0) {
                findNearestEnemy(targetTeam);
                this.arrow -= 1;
                Monastic.this.setArrow(this.arrow);
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


