package com.ex.Basic_1;

class Lesson1_6 {
    public static void main(String[] args) {
        new Lesson1_6(0, 0);
    }

    public Lesson1_6(int x, int y) {
        boolean isExist = false;
        if(y > 4 || y < -3 || x < -4 || x > 4 || y > 0 && x > 2 || y > 0 && x < -2) isExist = false;
        else isExist = true;
        System.out.println("Точка попадает в область: " + String.format("x:%d y:%d %b",x,y,isExist));
    }
}
