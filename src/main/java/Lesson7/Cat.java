package Lesson7;

// Класс "Кот" наследуется от класса "Животное"
public class Cat extends Animal {

    // Статическая переменная для подсчета экземпляров класса "Кот"
    static int catCount = 0;

    String name;

    /**
     * Переменная "Сытость" имеет модификатор private для того чтобы кота невозможно
     * было "накормить" без использования миски
     */
    private boolean isCatWellFed;

    // Конструктор инкрементирует переменную catCount и делает кота голодным
    public Cat(String name) {
        this.name = name;
        catCount++;
        isCatWellFed = false;
    }

    // Переопределенный метод "Бежать" с ограничением по дистанции для кота
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал: " + distance + "м");
        } else {
            System.out.println(name + " пробежал: 200м");
        }
    }

    // Переопределенный метод "Плыть"
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

    // Метод "Накормить кота"
    public void eat(BowlOfFood bowl) {
        if (!isCatWellFed) {
            if (bowl.amountOfFood >= 15) {
                isCatWellFed = true;
                bowl.amountOfFood = bowl.amountOfFood - 15;
                System.out.println("Кот " + this.name + " поел");
            } else {
                System.out.println("В миске недостаточно еды");
            }
        } else {
            System.out.println("Кот " + this.name + " сейчас не хочет есть");
        }
    }

    // Метод выводит в консоль информацию о сытости кота
    public void isCatWellFedInfo() {
        System.out.println(isCatWellFed ? this.name + " не хочет есть" : this.name + " хочет есть!");
    }

    // Метод выводит в консоль количество котов
    public static void catCountInfo() {
        System.out.println(catCount);
    }
}

// Класс "Миска с едой"
class BowlOfFood {
    int amountOfFood = 0;

    // Метод позволяет добавлять или убавлять количество еды в миске
    public void fillTheBowl(int amount) {
        if (amountOfFood + amount <= 0) {
            amountOfFood = 0;
        } else {
            amountOfFood = amountOfFood + amount;
        }
    }

    // Метод возвращает количество еды в миске
    public int getAmountOfFood() {
        return amountOfFood;
    }
}
