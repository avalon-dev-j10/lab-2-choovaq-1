package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon, Shape{
    
    private final float a;
    private final float b;
    private final float c;
    private final float h;
    private final int rotation;

    public Triangle(){
    a = (float) (10 * Math.random());
    b = (float) (10 * Math.random());
    c = (float) (10 * Math.random());
    h = (float) (10 * Math.random());
    rotation = (int) (10 * Math.random());
    }
  
    
    

    @Override
    public float getPerimeter() {
        return a + b + c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getArea() {
        return (a * h) / 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRotation() {
        return rotation; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        return "Triangle";
    }

     /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
