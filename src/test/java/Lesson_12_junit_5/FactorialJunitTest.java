package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Задача №1 Создание тестов для класса Factorial с использованием junit 5
public class FactorialJunitTest {

    // Создание экземпляра класса Factorial
    Factorial fTest = new Factorial();

    // Тест с положительным числом
    @Test
    public void factorialTest (){
        Assertions.assertEquals(720, fTest.getFactorial(6));
    }

    // Тест с нулём
    @Test
    public void factorialTest2 () {
        Assertions.assertEquals(1, fTest.getFactorial(0));
    }

    // Тест с отрицательным числом
    @Test
    public void factorialTest3 (){
        Assertions.assertEquals(0, fTest.getFactorial(-15));
    }
}
