package Lesson8;

// Исключение MyArraySizeException наследуется от Exception
public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        System.out.println("Размер массива не соответствует требуему!");
    }
}
