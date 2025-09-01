package com.works.useInterface;

public class Util implements IUser, IProfile{

    @Override
    public void logout() {

    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public String userName(int uid) {
        return "";
    }

}
