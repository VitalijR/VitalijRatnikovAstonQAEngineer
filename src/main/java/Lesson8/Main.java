package Lesson8;

public class Main {
    public static void main(String[] args) {
        String [] [] array1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        String [] [] array2 = {{"1", "2", "n", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        String [] [] array3 = {{"1", "2", "3", "4", "5"}, {"5", "6", "7", "8", "9"},
                {"9", "10", "11", "12", "13"}, {"13", "14", "15", "16", "17"}};

        String [] [] array4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"17", "18", "19", "20"}};
        ConvertingArray c = new ConvertingArray();

        try {
            System.out.println(c.convertAndSumma(array1));
        } catch (MyArraySizeException m) {
            m.printStackTrace();
        }catch (MyArrayDataException m) {
            m.printStackTrace();
        }

        try {
            System.out.println(c.convertAndSumma(array2));
        } catch (MyArraySizeException m) {
            m.printStackTrace();
        }catch (MyArrayDataException m) {
            m.printStackTrace();
        }

        try {
            System.out.println(c.convertAndSumma(array3));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException m) {
            m.printStackTrace();
        }

        try {
            System.out.println(c.convertAndSumma(array4));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException m) {
            m.printStackTrace();
        }

    }
}
