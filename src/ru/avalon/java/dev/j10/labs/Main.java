package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        for(int i = 0; i < 10; i++) {
            
            int  a = (int)(Math.random() * 3);
            
           switch(a){
               case 1:
                   shapes[i] = new Triangle();
                   break;
               case 2:
                   shapes[i] = new Circle();
                   break;
               case 0:
                   shapes[i] = new Rectangle();
               break;
           }
}
        
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
