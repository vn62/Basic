package com.ex.Basic_1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Lesson3_5 {
    public static void main(String[] args) {
        new Lesson3_5();
    }
    public Lesson3_5() {
        System.out.print("Введите число e (формат double через ',') : ");
        double e = Basics.scan.nextDouble();
        double summ = 0;

        int i = 1;
        while(true) {
            summ = summ + 1 / pow(2, i) + 1 / pow(3, i);
            if (summ > e) {
                System.out.println("Сумма " + i + " членов ряда равна: " + summ);
                break;
            }
            i++;
        }
    }
}
