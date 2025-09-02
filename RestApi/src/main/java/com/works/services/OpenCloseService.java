package com.works.services;

import com.works.openclose.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenCloseService {

    public String openClose(IUser iUser) {
        return iUser.entry();
    }

}
