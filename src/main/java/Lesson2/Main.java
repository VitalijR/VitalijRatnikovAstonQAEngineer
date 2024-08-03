package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создается экземпляр класса TasksFromLesson2
        TasksFromLesson2 tl = new TasksFromLesson2();

        // Проверка задачи №1
        tl.printThreeWords();
        System.out.println(); // Здесь и далее - дополнительный абзац для того что бы результаты разных методов не сливались

        // Проверка задачи №2
        tl.checkSumSign();
        System.out.println();

        // Проверка задачи №3
        tl.printColor();
        System.out.println();

        // Проверка задачи №4
        tl.compareNumbers();
        System.out.println();

        // Проверка задачи №5
        System.out.println(tl.isSumWithin(12, 2));
        System.out.println();

        // Проверка задачи №6
        tl.isPositiveNumber(-6);
        System.out.println();

        // Проверка задачи №7
        System.out.println(tl.isPositiveNumberBool(-15));
        System.out.println();

        // Проверка задачи №8
        tl.printStrings("Строка для печати", 3);
        System.out.println();

        // Проверка задачи №9
        System.out.println(tl.isLeapYear(2024));
        System.out.println();

        // Проверка задачи №10
        System.out.println(Arrays.toString(tl.arrayZeroToOne()));
        System.out.println();

        // Проверка задачи №11
        System.out.println(Arrays.toString(tl.fillTheArr()));
        System.out.println();

        // Проверка задачи №12
        System.out.println(Arrays.toString(tl.multiplicationNumbers()));
        System.out.println();

        // Проверка задачи №13
        int [] [] check4 = tl.squareArray();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(check4 [i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        // Проверка задачи №14
        System.out.println(Arrays.toString(tl.returnArray(6, 88)));
    }
}
