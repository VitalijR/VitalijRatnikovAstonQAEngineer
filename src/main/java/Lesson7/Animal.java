package Lesson7;

// Задача №1 Создание класса "Животное"
public abstract class Animal {

    // Статическая переменная для подсчета общего количества животных
    static int animalCount = 0;

    // Конструктор инкрементирует переменную animalCount
    public Animal() {
        animalCount++;
    }

    // Метод "Бежать"
    public abstract void run(int distance);

    // Метод "Плыть"
    public abstract void swim(int distance);

    // Метод выводит в консоль общее количество животных
    public static void animalCountInfo() {
        System.out.println(animalCount);
    }
}
