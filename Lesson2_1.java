package com.ex.Basic_1;

public class Lesson2_1 {
    public static void main(String[] args) {
        new Lesson2_1(70, 20);
    }

    public Lesson2_1(int a, int b) {
        int angle = 0;
        angle = a+b;

        if (180-angle > 0) {
            if (angle == 90) System.out.println("треугольник прямоугольный");
            else System.out.println("треугольник существует");
        }  else  System.out.println("треугольник не существует ");
    }
}
