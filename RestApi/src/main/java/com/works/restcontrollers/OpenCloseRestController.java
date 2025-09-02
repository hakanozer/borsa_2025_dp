package com.works.restcontrollers;

import com.works.openclose.AdminComponent;
import com.works.openclose.CustomerComponent;
import com.works.services.OpenCloseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openclose")
@RequiredArgsConstructor
public class OpenCloseRestController {

    final OpenCloseService openCloseService;

    final AdminComponent adminComponent;
    final CustomerComponent customerComponent;

    @GetMapping("get")
    public void get() {
        openCloseService.openClose(adminComponent);
    }

    @GetMapping("eft")
    public void eft() {
        openCloseService.openClose(customerComponent);
    }


}
