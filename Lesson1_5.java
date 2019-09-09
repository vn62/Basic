package com.ex.Basic_1;

public class Lesson1_5 {
    public static void main(String[] args) {
        new Lesson1_5(7721);
    }
    public Lesson1_5(int R) {
        int hour = R / 3600;
        int min = R / 60 - hour * 60;
        int sec = R % 60;
        System.out.println(String.format("Прошло времени: %02dч %02dмин %02dс", hour, min, sec));
    }
}
