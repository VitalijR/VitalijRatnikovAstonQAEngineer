package Lesson8;

public class ConvertingArray {
    public int convertAndSumma(String[][] arrayString) throws
            MyArraySizeException, MyArrayDataException {
        if (arrayString.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (arrayString[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                char[] c = arrayString[i][y].toCharArray();
                for (char ch : c) {
                    if (!Character.isDigit(ch)) {
                        throw new MyArrayDataException(arrayString[i][y], i+1, y+1);
                    }
                }
            }
        }


        int[][] arrayInt = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                arrayInt[i][y] = Integer.parseInt(arrayString[i][y]);
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                sum = sum + arrayInt[i][y];
            }
        }
        return sum;
    }
}
