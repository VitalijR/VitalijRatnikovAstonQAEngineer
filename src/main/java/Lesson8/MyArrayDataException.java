package Lesson8;

public class MyArrayDataException extends Exception{
public MyArrayDataException (String value, int row, int column){
    System.out.println("Значение " +value+ " в строке " +row+ ", столбце " +column);
}
}
