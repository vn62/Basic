package com.ex.Basic_1;

import java.math.BigInteger;

public class Lesson3_4 {
    public static void main(String[] args) {
        new Lesson3_4();
    }

    public Lesson3_4() {
        BigInteger mult = new BigInteger("1");
        for (int i = 1; i < 200; i++) {
            mult = mult.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Произведение квадратов 200 чисел: " + mult);
    }
}
