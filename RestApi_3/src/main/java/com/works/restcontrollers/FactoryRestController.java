package com.works.restcontrollers;

import com.works.factory.IPay;
import com.works.services.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("factory")
@RequiredArgsConstructor
public class FactoryRestController {

    private final PayService payService;

    @GetMapping("pay")
    public void pay(@RequestParam String payType) {
        payService.pay(payType);
    }

}
