package com.ex.Basic_1;

import static java.lang.Math.floor;

public class Lesson1_4 {
    public Lesson1_4(double R){
        double num1 = floor(R)/1000;
        int num2 = (int)((R - floor(R))*1000);
        System.out.println("Результат 1_4: " + (num2 + num1));
    }
}
