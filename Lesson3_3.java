package com.ex.Basic_1;

public class Lesson3_3 {
    public Lesson3_3() {
        double summ = 0;
        for (int i = 0; i < 100; i++) {
            summ = summ + i * i;
        }
        System.out.println("Результат 3_3: cумма квадратов 100 чисел: " + summ);
    }
}
