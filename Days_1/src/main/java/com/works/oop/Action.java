package com.works.oop;

public class Action {

    Profile profile = new Profile();
    public int i = 10;

    public Action() {
       System.out.println("Action Call");
    }

    public void call() {
       int a = 10;
       System.out.println(a);
    }

}
