package com.works.openclose;

import org.springframework.stereotype.Component;

@Component
public class AdminComponent implements IUser {


    @Override
    public String entry() {
        return "Admin Entry!";
    }

}
