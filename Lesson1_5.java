package com.ex.Basic_1;

public class Lesson1_5 {
    public Lesson1_5(int R) {
        int hour = R / 3600;
        int min = R / 60 - hour * 60;
        int sec = R % 60;
        System.out.println(String.format("Результат 1_5: %02dч %02dмин %02dс", hour, min, sec));
    }
}
