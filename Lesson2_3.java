package com.ex.Basic_1;

public class Lesson2_3 {
    public Lesson2_3(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.print("Результат 2_3: ");
        if((x2-x1)!=0 || (y2-y1)!=0) {
            if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1)))
                System.out.println("Точки лежат на одной прямой");
            else
                System.out.println("Точки не лежат на одной прямой");
        }
    }
}
