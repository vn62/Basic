package com.ex.Basic_1;

import static java.lang.Math.pow;

public class Lesson2_5 {
    public Lesson2_5(int x) {
        System.out.print("Результат 2_5: ");
        if(x <= 3)
            System.out.println(pow(x,2) - 3*x + 9);
        else
            System.out.println(1.0f / (pow(x,3) + 6));
    }
}
