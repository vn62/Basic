package com.ex.Basic_1;

public class Lesson2_2 {
    public static void main(String[] args) {
        new Lesson2_2(5, 8, 7, 9);

    }
    public Lesson2_2(int a, int b, int c, int d) {
        System.out.println("Максиммальное число: " + max(min(a, b), min(c, d)));
    }

    public static int min(int a, int b){
        return a>b?b:a;
    }

    public static int max(int a, int b){
        return a>b?a:b;
    }
}
