package Lesson_12_junit_5;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляра класса Factorial
        Factorial f = new Factorial();

        // Вызовы метода getFactorial с разными значениями
        System.out.println(f.getFactorial(5));
        System.out.println(f.getFactorial(6));
        System.out.println(f.getFactorial(-5));
    }
}
