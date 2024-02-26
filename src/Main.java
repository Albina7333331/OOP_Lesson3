//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе не было видно их полей.
//В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

//Крестьянин
//-Здоровье
//-Сила
//-Ловкость
//-Выносливость
//-Вид оружия
//-Уровень
//-ID
//-Имя
//-
//
//Разбойник
//-Здоровье
//-Сила
//-Ловкость
//-Выносливость
//-Вид оружия
//-PersУровень
//-ID
//-Имя
//-
//

//Снайпер
//-Здоровье
//-Сила
//-Ловкость
//-Выносливость
//-Вид оружия
//-Уровень
// -Меткость
//-ID
//-Имя
//- Маскировка

//Колдун
///-Здоровье
//-Интеллект
//-Ловкость
//-Выносливость
//-Вид оружия
//Уровень
//-ID
//-Имя
//- Мана

//Копейщик
///-Здоровье
//-Интеллект
//-Ловкость
//-Выносливость
//-Вид оружия
//Уровень
//-ID
//-Имя
//- Защита

//Арбалетчик
///-Здоровье
//-Интеллект
//-Ловкость
//-Выносливость
//-Вид оружия
//Уровень
//-ID
//-Имя
//- Количество стрел
// -Скорость стрельбы

//Монах
//-Здоровье
//-Интеллект
//-Ловкость
//-Выносливость
//-Вид оружия
//-Уровень
//-ID
//-Имя
//-Вера
//- Чакра


import pers.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Pers> team1 = new ArrayList<>();
        ArrayList<Pers> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(2)) {
                case 0:

                    team1.add(new Sniper(i, 0, getName(), 7,  7, 3));
                    break;
                case 1:
                    team1.add(new Crossbowman(i, 0, getName(),5,8,4));
                    break;
                case 2:
                    team1.add(new Spearman(i, 0, getName(),4,9,2, 30));
                    break;
            }
            switch (new Random().nextInt(2)) {
                case 0:
                    team2.add(new Sniper(i, 9, getName(),7,7,3));
                    break;
                case 1:
                    team2.add(new Crossbowman(i, 9, getName(),5,8,4));
                    break;
                case 2:
                    team2.add(new Spearman(i, 9, getName(),4,9,2, 30));
                    break;
            }
            ArrayList<Pers> all = new ArrayList<>();
            all.addAll(team1);
            all.addAll(team2);
            all.sort(new Comparator<Pers>() {
                @Override
                public int compare(Pers o1, Pers o2) {
                    return o1.getPriority() - o2.getPriority();
                }
            });
//                all.forEach(n -> System.out.println(n.toInfo()));

            for(Pers element : all){
                if (team1.contains(element)){
                    element.step(team2,team1);
                }else element.step(team1,team2);
            }
        }
        System.out.println(" " + "Team 1: ");
        for (int i = 0; i < team1.size(); i++) {
            team1.get(i).print();
        }
        System.out.println(" " + "Team 2: ");
        for (int i = 0; i < team2.size(); i++) {
            team2.get(i).print();
        }
    }
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.

