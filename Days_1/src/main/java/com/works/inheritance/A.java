package com.works.inheritance;

public class A extends Base {

    public A() {
        super(100);
        System.out.println("C Print: " + number);
    }

    public void callA() {
        System.out.println("CallA");
    }

    @Override
    public void print() {
        System.out.println("A Print");
    }

    public void sum() {
        System.out.println("A sum");
        print2();
        int i = 10;
        if (i > 10) {
            print();
        }else {
            super.print();
        }
    }



}
