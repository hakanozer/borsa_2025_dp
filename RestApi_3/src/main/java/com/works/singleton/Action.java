package com.works.singleton;

public class Action {

    private static Action instance;

    public static synchronized Action getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(500);
                instance = new Action();
                System.out.println("Action Call");
            }catch (Exception e){}
        }
        return instance;
    }

}
