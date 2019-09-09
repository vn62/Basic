package com.ex.Basic_1;

public class Lesson2_4 {
    public static void main(String[] args) {
        new Lesson2_4(5, 1, 1);
    }

    public Lesson2_4(int x, int y, int z) {
        int A = 2;
        int B = 2;
        System.out.println("Кирпич ");
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
