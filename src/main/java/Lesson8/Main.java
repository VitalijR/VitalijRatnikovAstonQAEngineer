package Lesson8;

public class Main {
    public static void main(String[] args) {

        // Создание корректного массива
        String[][] array1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        // Создание массива содержащего не числовое значение
        String[][] array2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "1F", "16"}};

        // Создание массива с неверным числом столбцов
        String[][] array3 = {{"1", "2", "3", "4", "5"}, {"5", "6", "7", "8", "9"},
                {"9", "10", "11", "12", "13"}, {"13", "14", "15", "16", "17"}};

        // Создание массива с неверным числом строк
        String[][] array4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"17", "18", "19", "20"}};

        // Создание экземпляра класса ConvertingArray
        ConvertingArray c = new ConvertingArray();

        // Блок try - catch для вызова метода с массивом array1
        try {
            System.out.println(c.convertAndSumma(array1));
        } catch (MyArraySizeException | MyArrayDataException m) {
            m.printStackTrace();
        }

        // Блок try - catch для вызова метода с массивом array2
        try {
            System.out.println(c.convertAndSumma(array2));
        } catch (MyArraySizeException | MyArrayDataException m) {
            m.printStackTrace();
        }

        // Блок try - catch для вызова метода с массивом array3
        try {
            System.out.println(c.convertAndSumma(array3));
        } catch (MyArraySizeException | MyArrayDataException m) {
            m.printStackTrace();
        }

        // Блок try - catch для вызова метода с массивом array4
        try {
            System.out.println(c.convertAndSumma(array4));
        } catch (MyArraySizeException | MyArrayDataException m) {
            m.printStackTrace();
        }
    }
}
