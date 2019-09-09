package com.ex.Basic_1;

public class Lesson3_2 {
    public static void main(String[] args) {
        new Lesson3_2(1, 9, 2);
    }

    public Lesson3_2(int a, int b, int h) {
        int count = a;
        System.out.print("Значение функции на отрезке от " + a + " до " + b + " c шагом " + h + " равно: ");
        while (true) {
            if (count > 2.0) System.out.print(count + " ");
            else System.out.print(-count + " ");

            count = count + h;
            if (count > b) break;
        }
        System.out.println("");
    }
}