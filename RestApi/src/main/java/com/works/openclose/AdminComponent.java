package com.works.openclose;

import org.springframework.stereotype.Component;

@Component
public class AdminComponent implements IUser {

    @Override
    public void entry() {
        System.out.println("Admin Entry!");
    }

}
