package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Задача №1 Создание тестов для класса Factorial с использованием junit 5
public class FactorialJunitTest {

    // Позитивный тест
    @Test
    public void factorialTest (){
        Factorial fTest = new Factorial();
        Assertions.assertEquals(720, fTest.getFactorial(6));
    }

    // Негативный тест
    @Test
    public void factorialTest2 (){
        Factorial fTest = new Factorial();
        Assertions.assertNotEquals(100, fTest.getFactorial(5));
    }

    // Позитивный тест
    @Test
    public void factorialTest3 (){
        Factorial fTest = new Factorial();
        Assertions.assertEquals(0, fTest.getFactorial(-15));
    }
}
