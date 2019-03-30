package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon, Shape{

    private final float a;
    private final float b;
    private final int rotation;

    public Rectangle() {
        a = (float) (10 * Math.random());
        b = (float) (10 * Math.random());
        rotation = (int) (10 * Math.random());
    }
    
    
    public float getPerimeter() {
        return 2 * (a + b);
    }

    
    public float getArea() {
        return a * b;
    }

    
    public int getRotation() {
        return rotation;  
    }
   
    public String toString() {
        return "Rectangle";
    }
    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
