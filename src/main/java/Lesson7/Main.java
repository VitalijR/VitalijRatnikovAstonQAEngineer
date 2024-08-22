package Lesson7;

public class Main {
    public static void main(String[] args) {

        // Проверка задачи №1 создание экземпляров котов и собак
        System.out.println("Проверка задачи №1 Подсчет, методы бежать и плыть");
        Cat cat1 = new Cat("Бегемот");
        Cat cat2 = new Cat("Матроскин");
        Cat cat3 = new Cat("Леопольд");
        Cat cat4 = new Cat("Чеширский");
        Dog dog1 = new Dog("Белка");
        Dog dog2 = new Dog("Стрелка");

        // Проверка подсчета общего количества животных
        System.out.print("Общее количество животных: ");
        Animal.animalCountInfo();

        // Проверка подсчета количества котов
        System.out.print("Количество котов: ");
        Cat.catCountInfo();

        // Проверка подсчета количества собак
        System.out.print("Количество собак: ");
        Dog.dogCountInfo();

        System.out.println();

        // Проверка метода "Бежать" у котов и собак
        cat1.run(50);
        cat2.run(325);
        dog1.run(125);
        dog2.run(900);

        System.out.println();

        // Проверка метода "Плыть" у котов и собак
        cat3.swim(50);
        dog1.swim(5);
        dog2.swim(20);

        System.out.println();
        System.out.println("Проверка кормления");

        // Создание экземпляра класса "Миска"
        BowlOfFood bowl = new BowlOfFood();

        // Наполнение миски едой
        bowl.fillTheBowl(50);

        // Вызов метода getAmountOfFood
        System.out.println("Количество еды = " + bowl.getAmountOfFood());

        // Создание массива котов
        Cat [] cats = new Cat[4];
        cats [0] = cat1;
        cats [1] = cat2;
        cats [2] = cat3;
        cats [3] = cat4;

        System.out.println();

        // Кормление котов
        for (Cat cat : cats){
            cat.eat(bowl);
        }

        System.out.println("Теперь количество еды = " + bowl.getAmountOfFood());
        System.out.println();

        // Проверка сытости котов
        System.out.println("Проверка сытости котов:");
        for (Cat cat : cats) {
            cat.isCatWellFedInfo();
        }

    }
}
