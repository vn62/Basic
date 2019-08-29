package com.ex.Basic_1;

public class Lesson3_2 {
    public Lesson3_2(int a, int b, int h) {
        int count = a;
        System.out.print("Результат 3_2: ");
        while (true) {
            if (count > 2.0) System.out.print(count + " ");
            else System.out.print(-count + " ");

            count = count + h;
            if (count > b) break;
        }
        System.out.println("");
    }
}