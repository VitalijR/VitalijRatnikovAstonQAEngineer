package Lesson6;

public class Main {
    public static void main(String[] args) {
        // Проверка задачи №1
        System.out.println("Проверка задачи №1");
        Employee em = new Employee("Иван Фёдорович Крузенштерн", "Исследователь",
                "seaexplorer@gmail.com", "+7 900 123 45 67", 35000, 66);
        em.printInfo();

        // Задача №2 Массив сотрудников
        Employee [] emArr = new Employee[5];
        emArr [0] = em;
        emArr [1] = new Employee("Томас Алва эдисон", "Изобретатель",
                "glowlamps@mail.ru", "+7 901 234 56 78", 500000, 50);
        emArr [2] = new Employee("Квентин Джером Тарантино", "Режиссер",
                "greatfilms@yandex.ru", "+7 902 345 67 89", 1000000000, 61);
        emArr [3] = new Employee("Филип Хэнсен Ансельмо", "Музыкант",
                "phillanselmo@rambler.ru", "+7 903 456 78 90", 350000, 56);
        emArr [4] = new Employee("Кристиан Фиторис", "Автогонщик",
                "christianvietoris@gmail.com", "+7 904 567 89 01", 78000, 35);

        // Проверка задачи №2
        System.out.println("Проверка задачи №2");
        for (Employee e : emArr) {
            e.printInfo();
        }

        // Проверка задачи №3
        System.out.println("Проверка задачи №3");

        // Создается экземпляр класса Park
        Park park = new Park();

        // Добавляются аттракционы
        park.attractions.add(new Park.Attraction("Колесо обозрения", "10:00 - 23:00",
                150, true));
        park.attractions.add(new Park.Attraction("Комната страха", "18:00 - 23:00",
                100, true));
        park.attractions.add(new Park.Attraction("Американские горки", "12:00 - 22:00",
                400, true));
        park.attractions.add(new Park.Attraction("Адская катапульта", "19:00 - 23:00",
                250, false));
        park.attractions.add(new Park.Attraction("Ларек с мороженным", "10:00 - 18:00",
                35, true));

        //Вызов метода parkInfo
        park.parkInfo();
    }
}
