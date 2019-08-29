package com.ex.Basic_1;

public class Lesson2_1 {
    public Lesson2_1(int a, int b) {
        int angle = 0;
        angle = a+b;
        System.out.print("Результат 2_1: ");
        if (180-angle > 0) {
            if (angle == 90) System.out.println("треугольник прямоугольный");
            else System.out.println("треугольник существует");
        }  else  System.out.println("треугольник не существует ");
    }
}
