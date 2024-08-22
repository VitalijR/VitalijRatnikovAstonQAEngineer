package Lesson7;

// Класс "Треугольник" реализует интерфейс GetParametersOfShape
public class Triangle implements GetParametersOfShape {
    String backgroundColor;
    String borderColor;
    int side1;
    int side2;
    int side3;

    // Конструктор принимает три стороны треугольника, цвет фона и границ
    public Triangle(int side1, int side2, int side3, String backgroundColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        return "Треугольник";
    }

    // Методы возвращают периметр и площадь треугольника
    public double getLength() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p;
        double a;
        p = getLength() / 2;
        a = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return a;
    }
}
