package Lesson7;

// Класс "Собака" наследуется от класса "Животное"
public class Dog extends Animal {

    // Статическая переменная для подсчета экземпляров класса "Собака"
    static int dogCount = 0;

    String name;

    // Конструктор инкрементирует переменную dogCount
    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    // Переопределенный метод "Бежать" с ограничением по дистанции для собаки
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал: " + distance + "м");
        } else {
            System.out.println(name + " пробежал: 500м");
        }
    }

    // Переопределенный метод "Плыть" с ограничением по дистанции для собаки
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл: " + distance + "м");
        } else {
            System.out.println(name + " проплыл: 10м");
        }
    }

    // Метод выводит в консоль количество собак
    public static void dogCountInfo() {
        System.out.println(dogCount);
    }
}