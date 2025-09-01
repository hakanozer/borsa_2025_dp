package com.works.useInterface;

public class UserImpl implements IUser{

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public String userName(int uid) {
        return "";
    }

}
