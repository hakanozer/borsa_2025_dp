package com.works.restcontrollers;

import com.works.openclose.AdminComponent;
import com.works.openclose.CustomerComponent;
import com.works.openclose.IUser;
import com.works.services.OpenCloseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openclose")
@RequiredArgsConstructor
public class OpenCloseRestController {

    final OpenCloseService openCloseService;

    //@Qualifier("adminComponent")
    final private AdminComponent adminComponent;


    @GetMapping("get")
    public String get() {
       return openCloseService.openClose(adminComponent);
    }


}
