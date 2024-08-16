package Lesson6;

import java.util.ArrayList;

// Задача №3 Класс Парк с внутренним классом аттракционы
public class Park {
    // Общая информация о парке
    String parkName = "Тридевятое царство";
    String parkTime = "Открыт с 10:00 до 23:00 каждый день";

    // Массив хранящий аттракционы
    ArrayList <Attraction> attractions = new ArrayList<>();

    // Метод выводит в консоль информацию о парке и об атракционах
    public void parkInfo (){
        System.out.println(parkName);
        System.out.println(parkTime);
        System.out.println("Спешите посетить наши аттракционы:");
        System.out.println();
        for (Attraction attraction : attractions){
            System.out.println(attraction.name);
            System.out.println("Время работы: " + attraction.time);
            System.out.println("Стоимость: " + attraction.cost + "Р");
            System.out.println(attraction.isChildAllowed ? "Разрешено для детей" : "Только для взрослых");
            System.out.println();
        }
    }

    // Внутренний класс Аттракционы
    public static class Attraction {
        // Информация об аттракционе
        String name;
        String time;
        int cost;
        boolean isChildAllowed;

        // Конструктор с аргументами
        public Attraction (String name, String time, int cost, boolean isChildAllowed){
            this.name = name;
            this.time = time;
            this.cost = cost;
            this.isChildAllowed = isChildAllowed;
        }
    }
}
