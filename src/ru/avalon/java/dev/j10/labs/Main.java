package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Circle();
        shapes[4] = new Rectangle();
        shapes[5] = new Triangle();
        shapes[6] = new Circle();
        shapes[7] = new Rectangle();
        shapes[8] = new Triangle();
        shapes[9] = new Circle();
        
        Shape smax = null;
        for (int i = 0; i < shapes.length; i++) {
             System.out.println(shapes[i] + " S = " + shapes[i].getArea());
             if (smax != null){
             if (shapes[i].getArea() > smax.getArea()) {
              smax = shapes[i];        
            } 
        } else { 
           smax = shapes[i];  }
        }
        
        System.out.println("Фигура с максимальной площадью = " + smax.getArea());

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
}
