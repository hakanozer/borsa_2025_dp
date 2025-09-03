package com.works.singleton;

public class MainSingleton {
    public static void main(String[] args) {

        ActionProfile p1 = new ActionProfile();
        ActionProfile p2 = new ActionProfile();
        ActionProfile p3 = new ActionProfile();

        p1.start();
        p2.start();
        p3.start();

    }
}
