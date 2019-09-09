package com.ex.Basic_1;

import java.util.Scanner;

public class Lesson3_8 {
    public static void main(String[] args) {
        new Lesson3_8();
    }

    public Lesson3_8() {
        System.out.println("Введите 1 число");
        int a = Basics.scan.nextInt(); // int a = 123;
        System.out.println("Введите 2 число");
        //int b = 3451;
        int b = Basics.scan.nextInt();//int b = 3451;

        int temp1 = a;
        int temp2 = b;
        int number1 = 0;
        int number2 = 0;

        System.out.print("Цифры входящие в запись обоих чисел ");
        while (temp1 > 0) {
            number1 = temp1 % 10;
            temp2 = b;
            while (temp2 > 0) {
                number2 = temp2 % 10;
                if (number1 == number2) {
                    System.out.print(number1 + " ");
                    break;
                }
                temp2 = temp2 / 10;
            }
            temp1 = temp1 / 10;
        }
    }
}

