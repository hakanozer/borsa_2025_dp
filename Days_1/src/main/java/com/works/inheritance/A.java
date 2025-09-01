package com.works.inheritance;

public class A extends Base {

    public void callA() {
        System.out.println("CallA");
    }

    @Override
    public void print() {
        System.out.println("A Print");
    }
}
