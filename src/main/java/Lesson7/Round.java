package Lesson7;

// Класс "Круг" реализует интерфейс GetParametersOfShape
public class Round implements GetParametersOfShape {
    String backgroundColor;
    String borderColor;
    int radius;

    // Конструктор принимает радиус, цвет фона и границ
    public Round(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
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
        return "Круг";
    }

    // Методы возвращают длину окружности и площадь круга
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
