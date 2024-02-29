import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import pers.*;
public class Main {
    public static ArrayList<Pers> holyTeam = new ArrayList<>();
    public static ArrayList<Pers> darkTeam = new ArrayList<>();
    public static ArrayList<Pers> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {

            switch (new Random().nextInt(3)) {
                case 0:

                    holyTeam.add(new Sniper(i, 1, getName(), 7,  7, 3));
                    break;
                case 1:
                    holyTeam.add(new Crossbowman(i, 1, getName(),5,8,4));
                    break;
                case 2:
                    holyTeam.add(new Spearman(i, 1, getName(),4,9,2, 30));
                    break;
            }
            switch (new Random().nextInt(3)) {
                case 0:
                    darkTeam.add(new Sniper(i, 10, getName(),7,7,3));
                    break;
                case 1:
                    darkTeam.add(new Crossbowman(i, 10, getName(),5,8,4));
                    break;
                case 2:
                    darkTeam.add(new Spearman(i, 10, getName(),4,9,2, 30));
                    break;
            }

            allTeam.addAll(holyTeam);
            allTeam.addAll(darkTeam);
            allTeam.sort((o1, o2) -> o2.getPriority() - o1.getPriority());
            allTeam.sort(new Comparator<Pers>() {
                @Override
                public int compare(Pers o1, Pers o2) {
                    return o1.getPriority() - o2.getPriority();
                }
            });
//                allTeam.forEach(n -> System.out.println(n.toInfo()));

            for(Pers element : allTeam){
                if (holyTeam.contains(element)){
                    element.step(darkTeam,holyTeam);
                }else element.step(holyTeam,darkTeam);
            }
        }
        View.view();

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            View.view();
            scanner.nextLine();
            for (Pers unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
        }


//        System.out.println(" " + "holyTeam: ");
//        for (int i = 0; i < holyTeam.size(); i++) {
//            holyTeam.get(i).print();
//        }
//        System.out.println(" " + "darkTeam: ");
//        for (int i = 0; i < darkTeam.size(); i++) {
//            darkTeam.get(i).print();
//        }

    }
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

}

//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.

