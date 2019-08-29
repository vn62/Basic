package com.ex.Basic_1;

public class Lesson3_1 {
    public Lesson3_1() {
        System.out.print("Lesson 3_1: ");
        System.out.print("Введите целое положительное число: ");
        int number = Basics.scan.nextInt();
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            summ = summ + i;
        }
        System.out.println("Результат 3_1: cумма до " + number + ": " + summ);
    }
}
