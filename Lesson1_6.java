package com.ex.Basic_1;

class Lesson1_6 {
    public Lesson1_6(int x, int y) {
        boolean isExist = false;
        if(y > 4 || y < -3 || x < -4 || x > 4 || y > 0 && x > 2 || y > 0 && x < -2) isExist = false;
        else isExist = true;
        System.out.println("Результат 1_6: " + String.format("x:%d y:%d %b",x,y,isExist));
    }
}
