package com.ex.Basic_1;

import java.util.Scanner;

public class Lesson3_6 {
    public Lesson3_6()  {
        System.out.println("Lesson 3_6");
        System.out.print("Введите символ: ");
        String str = Basics.scan.next();
        char c = str.charAt(0);
        int num = (int )c;
        System.out.println(String.format("Результат 3_6: cимвол %c соответствует /u04%x (%d)", c, num, num));
    }
}
