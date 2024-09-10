package Lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

// Задача №2 Создание тестов для класса Factorial с использованием testng
public class Factorial2TestngTest {

    // Создание экземпляра класса Factorial2
    Factorial2 f2 = new Factorial2();

    // Тест с положительным числом
    @Test
    public void factorial2Test1() {
        Assert.assertEquals(f2.getFactorial(5), 120);
    }

    // Тест с нулём
    @Test
    public void factorial2Test2() {
        Assert.assertEquals(f2.getFactorial(-5), 0);
    }

    // Тест с отрицательным числом
    @Test
    public void factorial2Test3() {
        Assert.assertEquals(f2.getFactorial(0), 1);
    }
}
