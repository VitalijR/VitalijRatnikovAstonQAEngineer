package Lesson11;

import java.util.*;

// Задача №1 Создание массива с повторяющимися словами
public class Words {

    // Создание массива слов
    String[] words = {"Ballantines", "Jameson", "Johnnie Walker", "Chivas Regal", "Jim Beam",
            "Jack Daniel’s", "Johnnie Walker", "Auchentoshan", "Wild Turkey", "Kilbeggan",
            "Ballantines", "Johnnie Walker", "Chivas Regal", "Ballantines", "Maker’s Mark",
            "Johnnie Walker", "Auchentoshan", "Johnnie Walker", "Auchentoshan", "Ballantines"};

    /** Метод возвращает HashSet с уникальными значениями из массива
    (используется в остальных методах класса) */
    public HashSet<String> getUniqueValues(String[] s) {
        return new HashSet<>(List.of(s));
    }

    // Метод выводит в консоль уникальные значения массива
    public void printUniqueValues(String[] s) {
        System.out.println(getUniqueValues(s));
    }

    // Метод выводит в консоль количества повторяющихся значений в массиве
    public void printCountWords(String[] s) {
        ArrayList<String> list = new ArrayList<>(List.of(s));
        for (Object a : getUniqueValues(s)) {
            System.out.println("Слово " + a + " повторяется: " + Collections.frequency(list, a) + " раз");
        }
    }
}