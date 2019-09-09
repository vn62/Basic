package com.ex.Basic_1;

import static java.lang.Math.pow;

public class Lesson2_5 {
    public static void main(String[] args) {
        new Lesson2_5(-2);

    }
    public Lesson2_5(int x) {
        System.out.print("Значение функции: ");
        if(x <= 3)
            System.out.println(pow(x,2) - 3*x + 9);
        else
            System.out.println(1.0f / (pow(x,3) + 6));
    }
}
