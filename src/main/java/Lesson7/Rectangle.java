package Lesson7;

// Класс "Прямоугольник" реализует интерфейс GetParametersOfShape
public class Rectangle implements GetParametersOfShape {
    String backgroundColor;
    String borderColor;
    int heightSide;
    int lengthSide;

    // Конструктор принимает выстоту и длину прямоугольника, цвет фона и границ
    public Rectangle(int heightSide, int lengthSide, String backgroundColor, String borderColor) {
        this.heightSide = heightSide;
        this.lengthSide = lengthSide;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    // Методы возвращают заданные параметры
    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getShape() {
        return "Прямоугольник";
    }

    // Методы возвращают периметр и площадь прямоугольника
    public double getLength() {
        return (heightSide + lengthSide) * 2;
    }

    public double getArea() {
        return heightSide * lengthSide;
    }
}
