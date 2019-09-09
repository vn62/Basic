package com.ex.Basic_1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Lesson1_2 {
    public static void main(String[] args) {
        new Lesson1_2(4, 5, 6);
    }

    public Lesson1_2(int a, int b, int c){
        if(a >0 && b >0 && c >0) {
            System.out.println("Значение выражения: " + ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a - pow(a, 3) * c + pow(b, -2)));
        }
    }
}
