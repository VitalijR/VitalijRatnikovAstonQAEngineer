package Lesson8;

// Задание Л8 Создание класса с методом принимающим массив и выводящим сумму чисел
public class ConvertingArray {

    public int convertAndSumma(String[][] arrayString) throws
            MyArraySizeException, MyArrayDataException {

        // Проверка массива на соответствие по числу строк
        if (arrayString.length != 4) {
            throw new MyArraySizeException();
        }

        // Проверка массива на соответствие по числу столбцов
        for (int i = 0; i < 4; i++) {
            if (arrayString[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        // Проверка массива на наличие не числовых значений
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                char[] c = arrayString[i][y].toCharArray();
                for (char ch : c) {
                    if (!Character.isDigit(ch)) {
                        throw new MyArrayDataException(arrayString[i][y], i + 1, y + 1);
                    }
                }
            }
        }

        // Подсчет суммы чисел
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                sum = sum + (Integer.parseInt(arrayString[i][y]));
            }
        }

        return sum;
    }
}
