package Lesson11;

public class Main {
    public static void main(String[] args) {

        System.out.println("Проверка задачи № 1. Уникальные слова");

        // Создание экземпляра класса Words
        Words w = new Words();

        // Вызов метода printUniqueValues
        w.printUniqueValues(w.words);

        System.out.println();
        System.out.println("Проверка задачи № 1. Количество повторяющихся слов");

        // Вызов метода printCountWords
        w.printCountWords(w.words);

        System.out.println();
        System.out.println("Проверка задачи № 2. Телефонная книга");

        // Создание экземпляра класса PhoneBook
        PhoneBook pb = new PhoneBook();

        // Создание нескольких записей в том числе с одинаковой фамилией
        pb.add("Иванов", "+7 901 234 56 78");
        pb.add("Петров", "+ 7 902 345 67 89");
        pb.add("Сидоров", "+ 7 903 456 78 90");
        pb.add("Иванов", "+ 7 904 567 89 01");

        System.out.println();

        // Поиск номера по фамилии
        pb.get("Петров");
        pb.get("Иванов");
    }
}
