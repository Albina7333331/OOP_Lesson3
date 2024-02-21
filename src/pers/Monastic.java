package pers;

public class Monastic extends Pers{
    int belief;
    int chakra;

    @Override
    public String toString(){
        return (this.name + " " + Monastic.class.getSimpleName());
    }




    public Monastic(int x, int y, String name) {
        super(x, y, name);
        this.belief = belief;
        this.chakra = chakra;
    }
}


