package Lesson_12_testng;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляра класса Factorial2
        Factorial2 f = new Factorial2();

        // Вызовы метода getFactorial с разными значениями.
        System.out.println(f.getFactorial(5));
        System.out.println(f.getFactorial(6));
        System.out.println(f.getFactorial(-5));
    }
}
