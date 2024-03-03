package pers;
import java.util.ArrayList;

public class Bandit extends Pers {
    int steal;
    public Bandit(String name, int x, int y) {
        super(name, 80, "knife", 30, 3, 13, 45, 30, new Place(x, y));
        steal = 10;
    }
    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (health <= 0) return;
        Pers target = super.findNearestEnemy(targetTeam);
        if (position.getDistance(target.position) < 2) {
            target.getHit(this.powerHit);
            return;
        }
        Place diff = this.position.getDiff(target.position);
        if (Math.abs(diff.x) > Math.abs(diff.y)) {
            this.position.x += diff.x < 0 ? 1 : -1;
        } else {
            this.position.y += diff.y < 0 ? 1 : -1;
        }
    }
    public String getInfo(){
    return "Бандит";
    }
}




