package com.ex.Basic_1;

import static java.lang.Math.*;

public class Lesson1_3 {
    public static void main(String[] args) {
        new Lesson1_3(2, 1);
    }

    public Lesson1_3(double x, double y){
        System.out.println("Значение выражения: " + ((sin(x) +cos(y)/(cos(x)-sin(y))*tan(x*y))));
    }
}
