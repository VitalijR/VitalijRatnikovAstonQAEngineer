package Lesson7;

// Задача №1 Создание интерфейса фигуры
public interface GetParametersOfShape {

    // Абстрактные методы
    String getBackgroundColor();

    String getBorderColor();

    String getShape();

    double getLength();

    double getArea();

    // Дефолтный метод для вывода в консоль параметров фигуры
    default void shapeInfo() {
        System.out.println("Фон фигуры " + getShape() + ": " + getBackgroundColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println("Периметр (длина окружности) = " + getLength());
        System.out.println("Площадь = " + getArea());
    }
}
