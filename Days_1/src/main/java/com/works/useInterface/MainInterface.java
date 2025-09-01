package com.works.useInterface;

public class MainInterface {

    public static void main(String[] args) {

        UserImpl userImpl = new UserImpl();
        CustomerImpl  customerImpl = new CustomerImpl();

        IUser iUser = new UserImpl();
        IUser customerUser = new CustomerImpl();

        Util util = new Util();
        IUser obj1 = new Util();
        IProfile obj2 = new Util();
        


    }

}
