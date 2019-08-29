package com.ex.Basic_1;

public class Lesson2_4 {
    public Lesson2_4(int x, int y, int z) {
        int A = 2;
        int B = 2;
        System.out.println("Результат 2_4: кирпич ");
        if (x < A) {  //x < A
            if (y < B | z < B) System.out.println("пройдет");
            else System.out.println("не пройдет");
        } else {   //x > A
            if (y < A && z < A) System.out.println("пройдет");
            else {
                if (x < B) {  //x < B{
                    if (y < A | z < A) System.out.println("пройдет");
                    else System.out.println("не пройдет");
                } else System.out.println("не пройдет");
            }
        }
    }
}
