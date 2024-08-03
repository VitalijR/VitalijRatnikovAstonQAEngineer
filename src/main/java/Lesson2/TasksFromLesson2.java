package Lesson2;

public class TasksFromLesson2 {

    // Задача №1 Метод выводит три слова в консоль
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задача №2 Метод выводит информацию о сумме двух чисел
    public void checkSumSign() {
        int a = -5;
        int b = 10;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    // Задача №3 Метод выводит цвет в зависимости от значения value
    public void printColor(){
        int value = 55;
        if (value <= 0)
            System.out.println("Красный");
        else
        if (value > 0 && value <=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    // Задача №4 Метод сравнивает два числа
    public void compareNumbers() {
        int a = 9;
        int b = 10;
        if (a >= b)
            System.out.println("a >= b");
        else System.out.println("a < b");
    }

    // Задача №5 Метод принимает два числа и сравнивает их сумму
    public boolean isSumWithin(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    // Задача №6 Метод принимает число и проверяет положительное оно или нет
    public void isPositiveNumber (int a){
        if (a >= 0)
            System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    // Задача №7 Метод принимает число, проверяет положительное оно или нет и возвращает boolean
    public boolean isPositiveNumberBool (int a) {
        return a < 0;
    }

    // Задача №8 Метод принимает строку и число, и печатает строку заданное число раз
    public void printStrings (String s, int a){
        if (a >= 0){
            for (int i = 0; i < a; i++) {
                System.out.println(s);
            }
        }
    }

    // Задача №9 Метод проверяет високосный ли год
    public boolean isLeapYear (int a){
        boolean b;
        if (a % 400 == 0) {
            b = true;
        } else if (a % 100 == 0) {
            b = false;
        } else if (a % 4 == 0) {
            b = true;
        } else {b = false;}
        return b;
    }

    // Задача №10 Метод меняет единицу на ноль и наоборот в массиве
    public int [] arrayZeroToOne (){
        int [] ar = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < ar.length; i++) {
            if (ar [i] == 0){
                ar [i] = 1;
            } else {
                ar [i] = 0;
            }
        }
        return ar;
    }

    // Задача №11 Метод заполняет массив числами
    public int [] fillTheArr (){
        int [] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred [i] = i + 1;
        }
        return hundred;
    }

    // Задача №12 Метод умножает числа которые меньше шести на два в массиве
    public int [] multiplicationNumbers (){
        int [] ar = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 6)
                ar [i] = ar [i] * 2;
        }
        return ar;
    }

    // Задача №13 Метод заполняет квадратный массив по диагоналям
    public int [] [] squareArray (){
        int [] [] squareAr = new int[10][10];
        int a = 9;
        for (int i = 0; i < 10; i++) {
            squareAr [i] [i] = 1;
            squareAr [a][i] = 1;
            a--;
        }
        return squareAr;
    }

    // Задача №14 Метод заполняет массив заданной длины заданными значениями
    public int [] returnArray (int len, int initialValue){
        int [] ar = new int[len];
        for (int i = 0; i < ar.length; i++) {
            ar [i] = initialValue;
        }
        return ar;
    }
}
