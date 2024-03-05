package pers;

import java.util.ArrayList;
import java.util.List;
public abstract class Pers implements Step {
    String name;
    int health;
    String weapon;
    int priority;
    int powerHit;
    int atackRange;
    int hidding;
    int maxHealth;
    int x;
    int y;
    int bronya;
    String className;
    public Place position;
    public Pers(String name, int health, String weapon, int powerHit, int priority, int bronya, int atackRange, int hidding, Place position){
    this.className = this.getClass().getSimpleName();
    this.name = name;
    this.maxHealth = this.health = health;
    this.weapon = weapon;
    this.powerHit = powerHit;
    this.priority = priority;
    this.bronya = bronya;
    this.atackRange = atackRange;
    this.hidding = hidding;
    this.position = position;
    }
    @Override
    public String toString() {
        return  name + ", \u2665: " + health + ",  ⚔ : " + powerHit + ", \uD83D\uDEE1\uFE0F :" + bronya;
    }
    //Нанесение урона
    public void getHit(float damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    public void Heal(Monk monk, Pers unit1) { unit1.health = unit1.health + monk.healing;}
    public void Damag(Pers unit1, Pers unit2) {
        unit1.health = unit1.health - unit2.powerHit;
    }
    public void Magical(Mag mag, Pers unit1) {
        unit1.health = unit1.health - mag.mana;
    }


    public Pers findNearestEnemy(List<Pers> targets) {
        if (targets.isEmpty()) {
            return null;
        }
        Pers nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Pers hero : targets) {
            double distance = position.getDistance(hero.position);
            if (distance < minDistance && hero.health > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }
        return nearest;
    }
    public int getPriority() {
        return priority;
    }
    public int getHp(){
        return health;
    };
    public String getInfo(){
        return " ";
    };
    }




