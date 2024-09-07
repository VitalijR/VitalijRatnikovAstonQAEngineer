package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class PhoneBook {

    TreeMap <String, List <String>> book = new TreeMap<>();

    public void add (String lastName, String phoneNumber){
        if (book.containsKey(lastName)){
            book.get(lastName).add(phoneNumber);
        } else {
            ArrayList <String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            book.put(lastName, numbers);
        }
        System.out.println("Запись " + lastName + " " + phoneNumber + " добавлена в телефонную книгу");
    }

    public void get (String lastName){
        System.out.println("Номера телефонов с фамилией " + lastName + ": " + book.get(lastName));
    }
}
