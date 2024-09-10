package Lesson_12_testng;

// Создание класса Factorial2
public class Factorial2 {

    // Метод возвращает факториал числа.
    public int getFactorial(int factorial) {
        int f = 1;
        if (factorial >= 0) {
            for (int i = 1; i <= factorial; i++) {
                f = f * i;
            }
        } else {
            f = 0;
            System.out.println("Число не может быть отрицательным!");
        }
        return f;
    }
}
