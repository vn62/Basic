package com.ex.Basic_1;


public class Lesson3_1 {
        public static void main(String[]args){
            new Lesson3_1();
        }

        public Lesson3_1(){
        System.out.print("Введите целое положительное число: ");
        int number = Basics.scan.nextInt();
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            summ = summ + i;
        }
        System.out.println("Cумма до " + number + ": " + summ);
    }
}
