package pers;

import java.util.Random;
abstract class Pers {
    protected static Random r;
    protected int id;
    protected String name;
    protected int health;
    protected int stamina;
    protected String weapon;

    static {
        Pers.r = new Random();
    }
    protected Pers(int id, String name, int health, int stamina, String weapon) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.weapon = weapon;
    }


    protected void print() {
        System.out.println( "ID: " + id + "Name: " + name + "Health" + health + "weapon: " + weapon + "Stamina: " + stamina);
    }


    protected void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health-= damage;
        }

    }
    protected void attack(Pers target){
        int damage = Pers.r.nextInt( 5);
        target.GetDamage(damage);
    }
    protected void death(Pers target){
        if (target.getHealth ()< 0){
            System.out.println("Ваш персонаж мерт");
        }
    }
    public int getHealth(){
        return health;
    }
}
