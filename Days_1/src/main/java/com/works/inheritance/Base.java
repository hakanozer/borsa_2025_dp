package com.works.inheritance;

public class Base {

    public Base() {
        System.out.println("Base Constructor");
    }

    int number = 0;
    public Base(int number) {
        this.number = number;
        System.out.println("Base Constructor :" + number);
    }

    public void print() {
        System.out.println("Base Print : " + number);
    }

    final public void print2() {
        System.out.println("Base Print2");
    }

    private void print3() {
        System.out.println("Base Print3");
    }

}
