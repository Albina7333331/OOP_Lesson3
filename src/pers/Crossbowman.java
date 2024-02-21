package pers;

import static pers.Place.getDistance;

public class Crossbowman extends Pers {
//    int accuracy;
//    int amount_of_arrows;

    @Override
    public String toString() {
        return (this.name + " " + Crossbowman.class.getSimpleName());
    }

    public Crossbowman(int x, int y, String name) {
        super(x, y, name);
//        this.accuracy = accuracy;
//        this.amount_of_arrows = amount_of_arrows;
    }


    public Pers findNearestEnemy(Pers[] enemies) {
        Pers nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Pers enemy : enemies) {
            if (enemy != null) {
                double distance = getDistance(position, enemy.position);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }

        return nearestEnemy;
    }


}
