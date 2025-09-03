package com.works.singleton;

public class ActionProfile extends Thread{

    @Override
    public void run() {
        Action.getInstance();
    }

}
