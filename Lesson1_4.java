package com.ex.Basic_1;

import static java.lang.Math.floor;

public class Lesson1_4 {
    public static void main(String[] args) {
        new Lesson1_4(123.456);
    }

    public Lesson1_4(double R){
        double num1 = floor(R)/1000;
        int num2 = (int)((R - floor(R))*1000);
        System.out.println("Поменять местами дробную и целую части числа и вывести полученное значение числа: " + (num2 + num1));
    }
}
