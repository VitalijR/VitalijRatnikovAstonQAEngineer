package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// Задача №2 Телефонная книга
public class PhoneBook {

    // Коллекция хранит фамилии в качестве ключей и номера в качестве значений
    TreeMap<String, List<String>> book = new TreeMap<>();

    // Метод add() для добавления абонентов
    public void add(String lastName, String phoneNumber) {
        if (book.containsKey(lastName)) {
            book.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            book.put(lastName, numbers);
        }
        System.out.println("Запись " + lastName + " " + phoneNumber + " добавлена в телефонную книгу");
    }

    // Метод get() для получения номеров по фамилии абонента
    public void get(String lastName) {
        System.out.println("Номера телефонов с фамилией " + lastName + ": " + book.get(lastName));
    }
}
