package com.works.restcontrollers;

import com.works.openclose.AdminComponent;
import com.works.openclose.CustomerComponent;
import com.works.openclose.IUser;
import com.works.services.OpenCloseService;
import com.works.useAbstract.PaymentProcessorFactory;
import com.works.useAbstract.PaymentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("openclose")
@RequiredArgsConstructor
public class OpenCloseRestController {

    final OpenCloseService openCloseService;
    private final Map<String, PaymentProcessorFactory> factories;

    //@Qualifier("adminComponent")
    final private AdminComponent adminComponent;

    @GetMapping("get")
    public String get() {
       return openCloseService.openClose(adminComponent);
    }

    @GetMapping("class")
    public String get(@RequestParam String name) {
        System.out.println(factories);
        PaymentProcessorFactory factory = factories.get(name);
        System.out.println(factory.getClass().getName());
       return openCloseService.openClose(adminComponent);
    }

}
