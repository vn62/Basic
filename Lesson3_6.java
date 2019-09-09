package com.ex.Basic_1;

import java.util.Scanner;

public class Lesson3_6 {
    public static void main(String[] args) {
        new Lesson3_6();
    }
    public Lesson3_6()  {
        System.out.print("Введите символ: ");
        String str = Basics.scan.next();
        char c = str.charAt(0);
        int num = (int )c;
        System.out.println(String.format("Cимвол %c соответствует /u04%x (%d)", c, num, num));
    }
}
