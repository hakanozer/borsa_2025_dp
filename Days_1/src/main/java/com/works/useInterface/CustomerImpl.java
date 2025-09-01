package com.works.useInterface;

public class CustomerImpl implements IUser{

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public String userName(int uid) {
        return "";
    }

}
