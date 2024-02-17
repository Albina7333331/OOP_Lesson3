package pers;

public class Monastic extends Pers{
    int belief;
    int chakra;

    @Override
    public String toString(){
        return (this.name + " " + Monastic.class.getSimpleName());
    }




    public Monastic(int id, String name, int health, int stamina, String weapon, int belief, int chakra) {
        super(id, name, health, stamina, weapon);
        this.belief = belief;
        this.chakra = chakra;
    }
}


