package Lesson6;

// Задача №1 Создание класса Сотрудник
public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    // Конструктор объекта с аргументами
    Employee (String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод выводит в консоль информацию о сотруднике
    public void printInfo (){
        System.out.println("Карточка сотрудника:");
        System.out.println("ФИО: " + this.name + "; Возраст: " + this.age);
        System.out.println("Должность: " + this.position + "; Зарплата: " + this.salary);
        System.out.println("E-mail: " + this.email + "; Телефон: " + this.phoneNumber);
        System.out.println();
    }
}
