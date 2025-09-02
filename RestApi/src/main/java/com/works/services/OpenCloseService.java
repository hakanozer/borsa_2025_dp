package com.works.services;

import com.works.openclose.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenCloseService {

    public void openClose(IUser iUser) {
        iUser.entry();
    }

}
