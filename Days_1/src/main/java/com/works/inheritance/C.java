package com.works.inheritance;

public class C extends Base{

    public void callC() {
        System.out.println("CallC");
    }

    @Override
    public void print() {
        System.out.println("C Print");
    }
}
