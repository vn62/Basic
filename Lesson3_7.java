package com.ex.Basic_1;

import java.util.Scanner;

public class Lesson3_7 {
    public static void main(String[] args) {
        new Lesson3_7();
    }

    public Lesson3_7() {
        System.out.print("Введите 1 число: ");
        int m = Basics.scan.nextInt();
        System.out.print("Введите 2 число: ");
        int n = Basics.scan.nextInt();

        System.out.println("Все делители ");
        for (int i = m; i < n; i++) {
            System.out.print("m=" + i + " : ");
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
