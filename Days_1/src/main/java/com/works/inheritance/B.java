package com.works.inheritance;

public class B extends Base {

    public void callB() {
        System.out.println("CallB");
    }

    @Override
    public void print() {
        System.out.println("B Print");
    }

}
