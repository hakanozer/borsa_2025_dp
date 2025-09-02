package com.works.openclose;

import org.springframework.stereotype.Component;

@Component
public class UserComponent implements IUser {

    @Override
    public void entry() {
        System.out.println("User Entry!");
    }

}
