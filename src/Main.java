//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
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
                    team1.add(new Sniper(i, 0, getName()));
                    break;
                case 1:
                    team1.add(new Crossbowman(i, 0, getName()));
                    break;
            }
            switch (new Random().nextInt(2)) {
                case 0:
                    team2.add(new Sniper(i, 9, getName()));
                    break;
                case 1:
                    team2.add(new Crossbowman(i, 9, getName()));
                    break;
            }

        }
//        System.out.println(" " + "Team 1: ");
//        team1.forEach(System.out::println);
//        System.out.println(" " + "Team 2: ");
//        team2.forEach(System.out::println);

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

