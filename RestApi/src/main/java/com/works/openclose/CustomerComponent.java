package com.works.openclose;

import org.springframework.stereotype.Component;

@Component
public class CustomerComponent implements IUser {

    @Override
    public String entry() {
        return "Customer Entry!";
    }

}

