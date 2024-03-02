import java.util.*;
import pers.*;
public class Main {
    public static ArrayList<Pers> holyTeam = new ArrayList<>();
    public static ArrayList<Pers> darkTeam = new ArrayList<>();
    public static ArrayList<Pers> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        init();
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getPriority() - o1.getPriority());
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            View.view();
            scanner.nextLine();
            int summ1HP = 0;
            int summ2HP = 0;
            for (Pers pers : holyTeam) {
                summ1HP += pers.getHp();
            }
            for (Pers pers : darkTeam) {
                summ2HP += pers.getHp();
            }
            if (summ1HP == 0) {
                System.out.println("Победила команда darkTeam");
                flag = false;
                break;
            }
            if (summ2HP == 0) {
                System.out.println("Победила команда holyTeam");
                flag = false;
                break;
            }
            for (Pers pers : allTeam) {
                if (holyTeam.contains(pers)) pers.step(darkTeam, holyTeam);
                else pers.step(holyTeam, darkTeam);

            }
        }
    }
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
    public static void init(){
        Random random = new Random();
        int countteam = 10;
        for (int i = 1; i < countteam+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Place xy1 = new Place(coordX1, 1);
            Place xy2 = new Place(coordX2, 10);
            System.out.println(xy1);

            switch (val) {
                case 0:
                    holyTeam.add(new Sniper(getName(), i,  1));
                    break;
                case 1:
                    holyTeam.add(new Crossbowman(getName(), i,  1));
                    break;
                case 2:
                    holyTeam.add(new Spearman(getName(), i,  1));
                    break;
                case 3:
                    holyTeam.add(new Peasant(getName(), i,  1));
                    break;
                case 4:
                    holyTeam.add(new Bandit(getName(), i,  1));
                    break;
                case 5:
                    holyTeam.add(new Monk(getName(), i,  1));
                    break;
                case 6:
                    holyTeam.add(new Mag(getName(), i,  1));
                    break;
            }
        }

        for (int i = 1; i < countteam+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Place xy1 = new Place(coordX1, 1);
            Place xy2 = new Place(coordX2, 10);
            System.out.println(xy1);
            switch (val) {
                case 0:
                    darkTeam.add(new Sniper(getName(), i, 10));
                    break;
                case 1:
                    darkTeam.add(new Crossbowman(getName(), i, 10));
                    break;
                case 2:
                    darkTeam.add(new Spearman(getName(), i, 10));
                    break;
                case 3:
                    darkTeam.add(new Peasant(getName(), i, 10));
                    break;
                case 4:
                    darkTeam.add(new Bandit(getName(), i, 10));
                    break;
                case 5:
                    darkTeam.add(new Monk(getName(), i, 10));
                    break;
                case 6:
                    darkTeam.add(new Mag(getName(), i, 10));
                    break;
            }
        }
    }
}




//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.

