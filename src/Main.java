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

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Monastic monastic = new Monastic(1, "Ivan", 5, 5, "Bible",10,9);
        Sniper sniper = new Sniper(2, "Laslo", 6, 6, "rifle",9, 9);
        Spearman spearman = new Spearman(3, "Ivares", 6, 6, "spear", 8,9);
        Crossbowman crossbowman = new Crossbowman(5, "Duncan", 5, 7, "crossbow",7, 8);
        Peasant peasant = new Peasant( 4, "Micola", 5, 4, "Plow", 5,4);
        Magic magic = new Magic(6,"Aleksii", 5,7 ,"Orb", 10,9);

        System.out.println(monastic) ;
        System.out.println(sniper) ;
        System.out.println(spearman) ;
        System.out.println(crossbowman) ;
        System.out.println(peasant) ;
        System.out.println(magic) ;
        
    }
     
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



}